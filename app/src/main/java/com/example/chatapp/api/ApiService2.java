package com.example.chatapp.api;

import com.example.chatapp.model.Fixture.FixtureModel;
import com.example.chatapp.model.Standing.StandingModel;
import com.example.chatapp.model.topScore.TopScoreModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiService2 {
    Gson gson = new GsonBuilder()
            .create();
    ApiService2 service = new Retrofit.Builder()
            .baseUrl("https://v3.football.api-sports.io/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService2.class);

    @GET(ApiPath.Standings)
    Call<StandingModel> getStandings(@Header("x-rapidapi-key") String header,
                                     @Query("league") int id,
                                     @Query("season") int season

    );

    @GET(ApiPath.TopScore)
    Call<TopScoreModel> getTopScore(@Header("x-rapidapi-key") String header,
                                    @Query("league") int id,
                                    @Query("season") int season

    );
    @GET(ApiPath.TopAssist)
    Call<TopScoreModel> getTopAssist(@Header("x-rapidapi-key") String header,
                                    @Query("league") int id,
                                    @Query("season") int season

    );

    @GET(ApiPath.Fixture)
    Call<FixtureModel> getFixture(@Header("x-rapidapi-key") String header,
                                  @Query("league") int id,
                                  @Query("season") int season,
                                  @Query("timezone") String timezone

    );

}
