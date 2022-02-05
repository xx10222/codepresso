package com.codepresso.blog.repository;

import com.codepresso.blog.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostRepository {

    List<Post> getAllPost();

    void save(@Param("post") Post post);

    Post getPost(@Param("id") int id);

    void modifyPost(@Param("post") Post post);

    void deletePost(@Param("id") int id);
}
