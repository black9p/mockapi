package me.black9p.mockapi.board;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author black9p
 */
@RestController
public class BoardController {

    @GetMapping("/boards")
    public Boards getBoards() {
        return Boards.of(Arrays.asList(Board.of(1), Board.of(2), Board.of(3)));
    }
}
