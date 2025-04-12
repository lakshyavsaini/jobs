package com.example.jobs.repository;

import com.example.jobs.model.Post;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface SearchRepository {
    List<Post> findByText(String text);

}
