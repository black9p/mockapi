package me.black9p.mockapi.post;

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
public class Post {
    private Integer id;
    private String title;
    private String content;
    private LocalDateTime modifyYmdt;
    private LocalDateTime registerYmdt;
    private String registrant;

    public static Post of(int id) {
        return Post.builder()
                   .id(id)
                   .title(String.format("제목 : %d", id))
                   .content(String.format("본문 : %d", id))
                   .modifyYmdt(LocalDateTime.now())
                   .registerYmdt(LocalDateTime.now())
                   .registrant("black9p")
                   .build();
    }
}
