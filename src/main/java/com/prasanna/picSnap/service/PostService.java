package com.prasanna.picSnap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasanna.picSnap.model.Post;
import com.prasanna.picSnap.repository.PostRepository;

import org.springframework.cache.annotation.Cacheable;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    // Methods for creating, retrieving, and managing posts
    // Use @Cacheable annotation for caching post data

    @Cacheable("postCache")
    public List<Post> getAllPosts() {
        
    	return null;
    }
}
