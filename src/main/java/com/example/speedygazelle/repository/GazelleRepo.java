package com.example.speedygazelle.repository;

import com.example.speedygazelle.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GazelleRepo extends MongoRepository<User, String> {
}
