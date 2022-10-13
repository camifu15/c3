package com.g30.jpa.repository;

import com.g30.jpa.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dmanrique
 */
public interface ScoreRepository extends JpaRepository<Score, Long>{
    
}
