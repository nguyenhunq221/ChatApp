package com.example.chatapp.model.topScore;

import java.util.List;

public class TopScoreModel {

    private String get;
    private List<String> errors;
    private int results;
    private List<ResponseDetail> response;

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public List<ResponseDetail> getResponse() {
        return response;
    }

    public void setResponse(List<ResponseDetail> response) {
        this.response = response;
    }
}
