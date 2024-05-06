package com.example.webclone.dto.response;

public class BoardCreateResponse {

    private String name;

    public BoardCreateResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
