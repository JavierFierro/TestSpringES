package com.test.coddix.repository;

import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.test.coddix.entity.User;

public interface UserRepository extends ElasticsearchRepository<User, String>{

	Optional<User> findOneByEmail(String email);
}
