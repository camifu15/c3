package com.g30.jpa.repository;

import com.g30.jpa.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dmanrique
 */
public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
