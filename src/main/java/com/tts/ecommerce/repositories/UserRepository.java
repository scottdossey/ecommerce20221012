package com.tts.ecommerce.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tts.ecommerce.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
