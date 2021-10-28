package ru.sberned.domclick.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sberned.domclick.demo.entities.MessageEntity;
import ru.sberned.domclick.demo.repositories.MessageRepository;

import java.util.List;


@RestController
class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/")
    public List<MessageEntity> getAllMessages()  {
        return messageRepository.findAll();
    }
}
