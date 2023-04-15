package com.example.chatapp.ui.Fragment;

import static android.content.Context.MODE_PRIVATE;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.chatapp.R;
import com.example.chatapp.databinding.FragmentInforBinding;
import com.example.chatapp.ui.ProfileActivity;
import com.example.chatapp.ui.SignInactivity;
import com.example.chatapp.ui.activities.HelpActivity;
import com.example.chatapp.ui.activities.IntroduceActivity;
import com.example.chatapp.ui.activities.SecurityActivity;
import com.example.chatapp.ui.activities.WallActivity;
import com.example.chatapp.utilities.Constants;
import com.example.chatapp.utilities.PreferenceManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class InforFragment extends BaseFragment {

    private FragmentInforBinding binding;
    private PreferenceManager preferenceManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInforBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        preferenceManager = new PreferenceManager(this.getActivity());
        setUpView();
        loadUserDetails();
    }

    private void setUpView() {
        binding.cardLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowBottomSheet();
            }
        });

        binding.cardWall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), WallActivity.class));
            }
        });

        binding.cardInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ProfileActivity.class));
            }
        });
        binding.cardHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), HelpActivity.class));
            }
        });

        binding.cardSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SecurityActivity.class));
            }
        });

        binding.cardIntroduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), IntroduceActivity.class));
            }
        });

    }

    private void showToast(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }

    private void loadUserDetails() {
        binding.name.setText(preferenceManager.getString(Constants.KEY_NAME));
        byte[] bytes = Base64.decode(preferenceManager.getString(Constants.KEY_IMAGE), Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        binding.logo.setImageBitmap(bitmap);
    }

    private void signOut() {
        showToast("Đang đăng xuất...");
        FirebaseFirestore database = FirebaseFirestore.getInstance();
        DocumentReference documentReference =
                database.collection(Constants.KEY_COLLECTION_USERS).document(
                        preferenceManager.getString(Constants.KEY_USER_ID)
                );
        HashMap<String, Object> updates = new HashMap<>();
        updates.put(Constants.KEY_FCM_TOKEN, FieldValue.delete());
        documentReference.update(updates)
                .addOnSuccessListener(unused -> {
                    preferenceManager.clear();

                    SharedPreferences preferences = getActivity().getSharedPreferences("MyPreferences", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.clear().commit();

                    startActivity(new Intent(getActivity(), SignInactivity.class));
                    getActivity().finish();
                })
                .addOnFailureListener(e -> showToast("Không thể đăng xuất"));
    }

    private void ShowBottomSheet(){

        // tao bottom sheet
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity());

        // tao view
        View view1 = LayoutInflater.from(getActivity()).inflate(R.layout.bottom_sheet_layout, null);

        Button ok = view1.findViewById(R.id.logOut);
        Button cancel = view1.findViewById(R.id.CancelLogOut);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signOut();
                bottomSheetDialog.cancel();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialog.cancel();
            }
        });

        bottomSheetDialog.setContentView(view1);
        bottomSheetDialog.show();

    }
}