package me.black9p.mockapi.board;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author black9p
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Board {
    private Integer boardNo;
    private String title;
    private String writer;
    @JsonFormat(pattern = "yyyyMMdd")
    private LocalDateTime registerDate;

    public static Board of(int boardNo) {
        return Board.builder()
                   .boardNo(boardNo)
                   .title(String.format("제목 : %d", boardNo))
                   .writer("black9p")
                   .registerDate(LocalDateTime.now().minusDays(boardNo))
                   .build();
    }
}
