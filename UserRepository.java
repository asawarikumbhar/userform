package com.example.user_form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user_form.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
