package com.g30.jpa.controller;

import com.g30.jpa.entity.Message;
import com.g30.jpa.service.MessageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dmanrique
 */
@RestController
@RequestMapping("/Message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    //Metodo para consultar todos los registros (Capa de controlador)
    @GetMapping("/all")
    public List<Message> getMessage() {
        return messageService.getMessage();
    }

    //Metodo para insertar (Capa de controlador)
    @PostMapping("/save")
    public ResponseEntity insertMessage(@RequestBody Message message) {
        messageService.insertMessage(message);
        return ResponseEntity.status(201).build();
    }
}
