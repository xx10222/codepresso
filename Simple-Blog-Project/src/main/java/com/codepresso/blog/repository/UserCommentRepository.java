package com.codepresso.blog.repository;

import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.UserComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Mapper
public interface UserCommentRepository {

    void enrollComment(@Param("comment") UserComment comment);

    List<UserComment> getCommentList(@Param("postId") int postId);
}
