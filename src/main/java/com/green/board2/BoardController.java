package com.green.board2;

import com.green.board2.model.BoardDeleteReq;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardPostReq;
import com.green.board2.model.BoardPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        return boardService.postBoard(p);
    }

    @GetMapping
    public List<BoardGetRes> getBoardList() {
        return boardService.getBoardList();
    }

    @GetMapping("/{boardId}")
    public BoardGetRes getBoardList(@PathVariable int boardId) {
        return boardService.getBoardOne(boardId);
    }

    @PutMapping
    public int postBoard(@RequestBody BoardPutReq p) {
        return boardService.putBoard(p);
    }

    @DeleteMapping
    public int getBoardList(@ModelAttribute BoardDeleteReq p) {
        return boardService.delBoard(p);
    }
}
