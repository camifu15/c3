package com.g30.jpa.controller;

import com.g30.jpa.entity.Client;
import com.g30.jpa.service.ClientService;
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
@RequestMapping("/Client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    
    //Metodo para consultar todos los registros (Capa de controlador)
    @GetMapping("/all")
    public List<Client> getClient(){
        return clientService.getClient();
    }

    //Metodo para insertar (Capa de controlador)
    @PostMapping("/save")
    public ResponseEntity insertClient(@RequestBody Client client){
      clientService.insertClient(client);
      return ResponseEntity.status(201).build(); 
    }
}
