package com.pathfinderbookclub.com.pathfinderblog.repository;

import com.pathfinderbookclub.com.pathfinderblog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
