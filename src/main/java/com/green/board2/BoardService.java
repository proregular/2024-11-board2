package com.green.board2;

import com.green.board2.model.BoardDeleteReq;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardPostReq;
import com.green.board2.model.BoardPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public int postBoard(BoardPostReq p) {
        return boardMapper.insBoard(p);
    }

    public List<BoardGetRes> getBoardList() {
        return boardMapper.selBoardList();
    }

    public BoardGetRes getBoardOne(int boardId) {
        return boardMapper.selBoardOne(boardId);
    }

    public int putBoard(BoardPutReq p) {
        return boardMapper.updBoard(p);
    }

    public int delBoard(BoardDeleteReq p) {
        return boardMapper.delBoard(p);
    }
}
