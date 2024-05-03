package com.example.webclone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity //테이블 관련 설정
@Data //lombok 기능 getter setter
public class Board {

    @Id //기본키 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //마리아db 표시
    private Integer id;

    private String title;

    private String content;
}
