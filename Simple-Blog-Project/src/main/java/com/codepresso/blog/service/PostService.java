package com.codepresso.blog.service;

import com.codepresso.blog.repository.PostRepository;
import com.codepresso.blog.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    public PostRepository postRepository;

    private PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPost() {
        return postRepository.getAllPost();
    }

    public void addPost(Post post) {
       postRepository.save(post);
    }

    public Post getPost(int id) {
        return postRepository.getPost(id);
    }

    public void modifyPost(Post post) {
       postRepository.modifyPost(post);
    }

    public void deletePost(int id) {
        postRepository.deletePost(id);
    }
}
