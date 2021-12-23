package com.malishev.instagram_clone.repository;


import com.malishev.instagram_clone.Entity.Comment;
import com.malishev.instagram_clone.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByPost(Post post);

    Comment findByIdAndUserId(Long commentId, Long userId);









}
