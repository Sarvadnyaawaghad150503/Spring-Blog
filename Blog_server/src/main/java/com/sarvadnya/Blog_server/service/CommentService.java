package com.sarvadnya.Blog_server.service;

import com.sarvadnya.Blog_server.entity.Comment;

public interface CommentService {
    public Comment createComment (Long postId, String postedBy, String content );
}
