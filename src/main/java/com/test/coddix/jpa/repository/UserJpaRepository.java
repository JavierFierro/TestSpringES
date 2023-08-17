package com.test.coddix.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.coddix.entity.User;

public interface UserJpaRepository extends JpaRepository<User, String>{

	Optional<User> findOneByEmail(String email);

}
