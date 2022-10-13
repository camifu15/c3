package com.g30.jpa.repository;

import com.g30.jpa.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dmanrique
 */
public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
