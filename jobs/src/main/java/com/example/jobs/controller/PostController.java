package com.example.jobs.controller;

import com.example.jobs.repository.PostRepository;
import com.example.jobs.model.Post;
import com.example.jobs.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/posts")
    public List<Post> posts() {
        return repo.findAll();
    }

    @PostMapping("/posts/{text}")
    public List<Post>search(@PathVariable String text) {
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post) {
        return repo.save(post);
    }
}