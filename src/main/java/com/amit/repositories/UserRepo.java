package com.amit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
