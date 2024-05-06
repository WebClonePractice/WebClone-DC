package com.example.webclone.service;

import com.example.webclone.domain.Board;
import com.example.webclone.domain.BoardRepository;
import com.example.webclone.dto.request.BoardCreateRequest;
import com.example.webclone.dto.response.BoardCreateResponse;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void createBoard(BoardCreateRequest request) {
        Board board = new Board(request.getName());
        boardRepository.save(board);
    }

}
