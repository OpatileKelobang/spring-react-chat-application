package za.co.bogote.springreactchatapplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import za.co.bogote.springreactchatapplication.model.ChatMessage;
import za.co.bogote.springreactchatapplication.model.MessageStatus;

import java.util.List;

public interface ChatMessageRepository extends MongoRepository<ChatMessage, String> {

    long countBySenderIdAndRecipientIdAndStatus(String senderId, String recipientId, MessageStatus status);
    List<ChatMessage> findByChatId(String chatId);
}
