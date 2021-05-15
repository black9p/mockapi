package me.black9p.mockapi.post;

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
public class Posts {
    private List<Post> posts;

    public static Posts of(List<Post> posts) {
        return Posts.builder()
                    .posts(posts)
                    .build();
    }
}
