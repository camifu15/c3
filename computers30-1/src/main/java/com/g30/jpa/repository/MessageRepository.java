package com.g30.jpa.repository;

import com.g30.jpa.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dmanrique
 */
public interface MessageRepository extends JpaRepository<Message, Long>{
    
}
