package com.example.webclone.controller;

import com.example.webclone.dto.request.BoardCreateRequest;
import com.example.webclone.dto.response.BoardCreateResponse;
import com.example.webclone.service.BoardService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardApiController {

    private BoardService boardService;

    public BoardApiController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/jmj/create")
    public void test(BoardCreateRequest request) {
        boardService.createBoard(request);
    }

}
