package com.example.webclone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/")
    public String boardMain() {
        return "boardMain";
    }

    @GetMapping("/김동욱")
    public String boardKDW() {
        return "boardKDW";
    }

    //test3333
}