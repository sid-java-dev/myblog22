package com.myblog.myblog22.repository;

import com.myblog.myblog22.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

}
