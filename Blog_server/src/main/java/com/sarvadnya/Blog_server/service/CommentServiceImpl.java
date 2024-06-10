package com.sarvadnya.Blog_server.service;

import com.sarvadnya.Blog_server.entity.Comment;
import com.sarvadnya.Blog_server.entity.Post;
import com.sarvadnya.Blog_server.repository.CommentRepository;
import com.sarvadnya.Blog_server.repository.PostRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CommentServiceImpl implements  CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private PostRepository postRepository;

    public Comment createComment (Long postId, String postedBy, String content ){
        Optional<Post> optionalPost = postRepository.findById(postId);

        if(optionalPost.isPresent()){
            Comment comment = new Comment();

            comment.setPost(optionalPost.get());
            comment.setPostedBy(postedBy);
            comment.setCreatedAt(new Date());

            return  commentRepository.save(comment);
        }
        throw new EntityNotFoundException("Post not Found");
    }
}
