package me.black9p.mockapi.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * @author black9p
 */
@WebMvcTest(PostController.class)
@AutoConfigureRestDocs
class PostControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void test_getPosts() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/posts")
                                              .accept(MediaType.APPLICATION_JSON))
                                              .andDo(MockMvcResultHandlers.print())
                                              .andExpect(MockMvcResultMatchers.status().isOk())
                                              .andDo(document("posts",
                                                      responseFields(
                                                              fieldWithPath("posts").description("글 목록"),
                                                              fieldWithPath("posts[].id").description("아이디"),
                                                              fieldWithPath("posts[].title").description("제목"),
                                                              fieldWithPath("posts[].content").description("내용"),
                                                              fieldWithPath("posts[].modifyYmdt").description("수정일시"),
                                                              fieldWithPath("posts[].registerYmdt").description("등록일시"),
                                                              fieldWithPath("posts[].registrant").description("등록자")
                                                      )
                                              ));
    }
}