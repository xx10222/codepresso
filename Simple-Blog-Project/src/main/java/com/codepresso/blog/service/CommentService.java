package com.codepresso.blog.service;

import com.codepresso.blog.repository.PostRepository;
import com.codepresso.blog.repository.UserCommentRepository;
import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.UserComment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    public UserCommentRepository userCommentRepository;

    private CommentService(UserCommentRepository userCommentRepository) {
        this.userCommentRepository = userCommentRepository;
    }

    public void enrollComment(UserComment comment) {
           userCommentRepository.enrollComment(comment);
        }

    public List<UserComment> getCommentList(int postId) {
       return userCommentRepository.getCommentList(postId);
    }
}

