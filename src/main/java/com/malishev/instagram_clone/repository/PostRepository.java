package com.malishev.instagram_clone.repository;

import com.malishev.instagram_clone.Entity.Post;
import com.malishev.instagram_clone.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByUserOrderByCreateDateDesc(User user);

    List<Post> findAllByOrderByCreateDateDesc();

    Optional<Post> findPostByIdAndUser(Long id);


}
