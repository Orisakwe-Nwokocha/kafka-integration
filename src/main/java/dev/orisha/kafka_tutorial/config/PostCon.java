package dev.orisha.kafka_tutorial.config;

import com.example.demo.Post;
import com.example.demo.PostDto;
import com.example.demo.PostService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostCon {

    private final PostService postService;

    @Autowired
    public PostCon(PostService postService) {
        this.postService = postService;
    }

    @PostConstruct
    public void postConstruct() {
        PostDto postDto = new PostDto();
        postDto.setTitle("Post Title");
        postDto.setBody("Post Body");
        Post post = postService.createPost(postDto);
        System.out.println(post);
    }
}
