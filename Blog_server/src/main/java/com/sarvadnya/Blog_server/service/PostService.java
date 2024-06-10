package com.sarvadnya.Blog_server.service;

import com.sarvadnya.Blog_server.entity.Post;

import java.util.List;

public interface PostService {
    Post savePost(Post post);
    List<Post> getAllPosts();

    Post getPostById(Long postId);

     void likePost (Long postId);
}
