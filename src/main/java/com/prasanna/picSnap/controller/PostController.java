package com.prasanna.picSnap.controller;

import com.prasanna.picSnap.model.Post;
import com.prasanna.picSnap.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/feed")
    public String showFeed(Model model) {
        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "feed";
    }

    @GetMapping("/post")
    public String showPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "post";
    }

    @PostMapping("/post")
    public String createPost(Post post) {
        // Implement post creation logic
        return "redirect:/feed";
    }
}