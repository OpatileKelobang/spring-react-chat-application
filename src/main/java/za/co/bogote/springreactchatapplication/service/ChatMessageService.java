package za.co.bogote.springreactchatapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;
import za.co.bogote.springreactchatapplication.repository.ChatMessageRepository;

@Service
public class ChatMessageService {

    @Autowired
    private ChatMessageRepository repository;
    @Autowired
    private ChatRoomService chatRoomService;
    @Autowired
    private MongoOperations mongoOperations;
}
