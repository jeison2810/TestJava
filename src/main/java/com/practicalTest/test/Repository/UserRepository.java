package com.practicalTest.test.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicalTest.test.Entity.User;

public interface UserRepository extends JpaRepository<User,UUID>{

    Optional<User> findByEmail(String email);

}
