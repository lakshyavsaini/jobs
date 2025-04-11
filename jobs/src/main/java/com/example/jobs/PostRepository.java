package com.example.jobs;

import com.example.jobs.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface PostRepository extends MongoRepository<Post, String> {
}
