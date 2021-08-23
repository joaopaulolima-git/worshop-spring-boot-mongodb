package com.jpdev.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jpdev.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
