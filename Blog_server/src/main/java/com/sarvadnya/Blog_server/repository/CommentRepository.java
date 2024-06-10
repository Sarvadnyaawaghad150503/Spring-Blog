package com.sarvadnya.Blog_server.repository;

import com.sarvadnya.Blog_server.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long>
{
}
