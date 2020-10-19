package za.co.bogote.springreactchatapplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import za.co.bogote.springreactchatapplication.model.ChatRoom;

import java.util.Optional;

public interface ChatRoomRepository extends MongoRepository<ChatRoom, String> {
    Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}
