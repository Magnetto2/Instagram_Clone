package com.malishev.instagram_clone.repository;


import com.malishev.instagram_clone.Entity.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageModelRepository extends JpaRepository<ImageModel, Long> {

    //Фото для юзера
    Optional<ImageModel> findByUserId(Long userId);


    //Фото для поста
    Optional<ImageModel> findByPostId(Long postId);




}
