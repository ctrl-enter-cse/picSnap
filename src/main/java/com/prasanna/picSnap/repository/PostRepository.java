package com.prasanna.picSnap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasanna.picSnap.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
