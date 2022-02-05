package com.codepresso.blog.controller;

import com.codepresso.blog.service.PostService;
import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    public PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "/posts")
    public List<Post> getAllPost(){
        List<Post> list = postService.getAllPost();
        return list;
    }

    @PostMapping(value = "/post")
    public Result addPost(@RequestBody Post post) {
        postService.addPost(post);
        return new Result(200, "Success");
    }

    @GetMapping(value = "/post")
    public Post getPost(@RequestParam int id){
        Post post = postService.getPost(id);
        return post;
    }

    @PutMapping("/post")
    public Result modifyPost(@RequestBody Post post) {
        postService.modifyPost(post);
        return new Result(200, "Success");
    }

    @DeleteMapping(value = "/post")
    public Result deletePost (@RequestParam int id) {
        postService.deletePost(id);
        return new Result(200, "Success");
    }



}
