package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(" select u from User u " +
            " where u.username = ?1")
    Optional<User> findUserWithName(String username);


}