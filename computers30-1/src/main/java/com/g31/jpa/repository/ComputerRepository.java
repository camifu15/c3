package com.g31.jpa.repository;

import com.g31.jpa.entity.Computer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author desaextremo
 */
public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
