package com.lidigu.WebSocket.repository;

import com.lidigu.WebSocket.user.Status;
import com.lidigu.WebSocket.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByStatus(Status status);
}
