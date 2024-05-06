package com.example.webclone.dto.request;


public class BoardCreateRequest {

    private String name;

    public BoardCreateRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
