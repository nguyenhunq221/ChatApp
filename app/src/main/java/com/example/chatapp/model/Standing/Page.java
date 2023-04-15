package com.example.chatapp.model.Standing;

public class Page {
    private int  current;
    private int total ;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

//"paging":{
//        "current": 1,
//        "total": 1
//        },