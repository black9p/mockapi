package me.black9p.mockapi.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * 게시판 컨트롤러
 * @author black9p
 */
@RestController
public class PostController {

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return Arrays.asList(Post.of(1), Post.of(2), Post.of(3));
    }
}
