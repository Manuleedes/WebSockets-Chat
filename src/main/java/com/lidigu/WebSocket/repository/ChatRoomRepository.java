package com.lidigu.WebSocket.repository;

import com.lidigu.WebSocket.chatroom.ChatRoom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ChatRoomRepository extends MongoRepository<ChatRoom,String > {
    Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}
