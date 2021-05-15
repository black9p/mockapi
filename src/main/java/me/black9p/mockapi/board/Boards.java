package me.black9p.mockapi.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author black9p
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Boards {
    private List<Board> result;

    public static Boards of(List<Board> board) {
        return Boards.builder()
                    .result(board)
                    .build();
    }
}
