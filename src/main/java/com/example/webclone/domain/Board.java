package com.example.webclone.domain;

import jakarta.persistence.*;

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    public Board() {

    }

    public Board(String name) {
        this.name = name;
    }


}
