package com.example.webclone.controller;

import com.example.webclone.entity.Board;
import com.example.webclone.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String boardMain() {
        return "boardMain";
    }

    @GetMapping("/김동욱")
    public String boardKDW() {
        return "boardKDW";
    }

    @GetMapping("/김동욱/board/write")
    public String boardWrite() {
        return "boardWrite";
    }

    @PostMapping("/김동욱/board/writepro")
    public String boardWritePro(Board board) {

        boardService.write(board);

        return "";
    }

    @GetMapping("/김동욱/board/list")
    public String boardList(Model model) {


        return "boardList";
    }
}