package com.g30.jpa.repository;

import com.g30.jpa.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dmanrique
 */
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
