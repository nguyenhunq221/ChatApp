package com.example.chatapp.model.Standing;

import java.util.List;

public class StandingModel {
    private String get;
    private Param parameters;
    private List<String> errors;
    private int results;
    private Page paging;
    private List<Response> response;

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public Param getParameters() {
        return parameters;
    }

    public void setParameters(Param parameters) {
        this.parameters = parameters;
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

    public Page getPaging() {
        return paging;
    }

    public void setPaging(Page paging) {
        this.paging = paging;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }
}
//{
//        "get": "standings",
//        "parameters":{"league": "39", "season": "2022"},
//        "errors":[],
//        "results": 1,
//        "paging":{"current": 1, "total": 1},
//        "response":[{"league":{"id": 39, "name": "Premier League", "country": "England",…]
//        }
