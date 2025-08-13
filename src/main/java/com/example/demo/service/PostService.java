package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        return List.of(
                new Post("1 post", new Date()),
                new Post("2 post", new Date()),
                new Post("3 post", new Date())
        );
    }
}
