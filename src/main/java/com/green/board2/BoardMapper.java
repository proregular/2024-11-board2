package com.green.board2;

import com.green.board2.model.BoardDeleteReq;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardPostReq;
import com.green.board2.model.BoardPutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    int insBoard(BoardPostReq p);
    List<BoardGetRes> selBoardList();
    BoardGetRes selBoardOne(int boardId);
    int updBoard(BoardPutReq p);
    int delBoard(BoardDeleteReq p);
}
