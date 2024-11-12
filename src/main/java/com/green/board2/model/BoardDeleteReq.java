package com.green.board2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDeleteReq {
    private int boardId;
    private String writer;
}
