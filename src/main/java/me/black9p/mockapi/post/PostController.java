package me.black9p.mockapi.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 게시판 컨트롤러
 * @author black9p
 */
@RestController
public class PostController {

    @GetMapping("/posts")
    public Posts getPosts() {
        return Posts.of(Arrays.asList(Post.of(1), Post.of(2), Post.of(3)));
    }

    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable Integer id) {
        return Post.of(1);
    }
}
