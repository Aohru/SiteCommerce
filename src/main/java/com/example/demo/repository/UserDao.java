package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDao extends CrudRepository<User, Long> {

    public User save(User user); // INSERT into produit
    Optional<User> findUserByUsername(String username);
}
