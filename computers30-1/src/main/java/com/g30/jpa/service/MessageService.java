package com.g30.jpa.service;

import com.g30.jpa.entity.Message;
import com.g30.jpa.repository.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dmanrique
 */
@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    //Metodo para consultar todos los registros (Capa de servicios)
    public List<Message> getMessage() {
        return messageRepository.findAll();
    }

    //Metodo para insertar (Capa de servicios)
    public Message insertMessage(Message message) {
        return messageRepository.save(message);
    }
}
