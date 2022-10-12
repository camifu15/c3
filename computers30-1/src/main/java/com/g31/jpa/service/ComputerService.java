package com.g31.jpa.service;

import com.g31.jpa.entity.Computer;
import com.g31.jpa.repository.ComputerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author desaextremo
 */
@Service
public class ComputerService {
    @Autowired
    private ComputerRepository computerRepository;
     
    public List<Computer> getComputerList(){
        return computerRepository.findAll();
    }
    
    public Computer getComputer(Long id){
        return computerRepository.findById(id).get();
    }
    
    public Computer saveComputer(Computer computer){
        return computerRepository.save(computer);
    }
    
//    public Computer updateComputer(Computer computer){
//        return computerRepository.save(computer);
//    }
    
    public Computer updateComputer(Computer computer){
        //valido si viene un id en la información de la peticion
        //si no viene retorno la entidad recibida como parametro
        if (computer.getId()!=null){
            //valido si el id existe en la base de datos
            Optional<Computer> opcional = computerRepository.findById(computer.getId());
            
            if (!opcional.isEmpty()){
                //logica
                Computer computerBD = opcional.get();
                
                computerBD.setName(computer.getName());
                computerBD.setCategory(computer.getCategory());
                computerBD.setDescription(computer.getDescription());
                computerBD.setBrand(computer.getBrand());
                computerBD.setYear(computer.getYear());
                return computerRepository.save(computerBD);
            }else{
                return computer;
            }
        }
        return computer;
        
    }
    
    public void deleteComputer(Long id){
        computerRepository.deleteById(id);
    }
}
