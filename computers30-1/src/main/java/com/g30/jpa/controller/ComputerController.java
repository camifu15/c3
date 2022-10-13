package com.g30.jpa.controller;

import com.g30.jpa.entity.Computer;
import com.g30.jpa.service.ComputerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dmanrique
 */
@RestController
@RequestMapping("/Computer")
@CrossOrigin(origins = "*")
public class ComputerController {
    @Autowired
    private ComputerService computerService;

    @GetMapping("/all")
    public List<Computer> getComputerList() {
        return computerService.getComputerList();
    }

    @GetMapping("/{id}")
    public Computer getComputer(@PathVariable("id") Long id) {
        return computerService.getComputer(id);
    }
    
    @PostMapping("/save")
    public ResponseEntity saveComputer(@RequestBody Computer computer){
        computerService.saveComputer(computer);
        return ResponseEntity.status(201).build();
    }
    
//    @PutMapping("/update")
//    public ResponseEntity updateComputer(@RequestBody Computer computer){
//        computerService.updateComputer(computer);
//        return ResponseEntity.status(201).build();
//    } 
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer updateComputer(@RequestBody Computer computer){
        return computerService.updateComputer(computer);        
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteComputer(@PathVariable("id") Long id){
       computerService.deleteComputer(id);
       return ResponseEntity.status(204).build();
    }
}
