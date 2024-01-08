package com.example.atmmachine.repository;

import com.example.atmmachine.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
