package com.codepresso.blog.controller;

import com.codepresso.blog.service.CommentService;
import com.codepresso.blog.service.PostService;
import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.Result;
import com.codepresso.blog.vo.UserComment;
import org.h2.engine.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    public CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping(value = "/comment")
    public Result enrollComment(@RequestBody UserComment comment) {
        commentService.enrollComment(comment);
        return new Result(200, "OK");
    }


    @GetMapping(value = "/comments")
    public List<UserComment> getCommentList(@RequestParam("post_id") int postId){
        List<UserComment> list = commentService.getCommentList(postId);
        return list;
    }




}
gi