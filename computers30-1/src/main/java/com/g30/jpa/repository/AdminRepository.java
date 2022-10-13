package com.g30.jpa.repository;

import com.g30.jpa.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dmanrique
 */
public interface AdminRepository extends JpaRepository<Admin, Long>{
    
}
