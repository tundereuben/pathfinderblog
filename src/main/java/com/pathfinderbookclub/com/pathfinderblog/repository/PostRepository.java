package com.pathfinderbookclub.com.pathfinderblog.repository;

import com.pathfinderbookclub.com.pathfinderblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
