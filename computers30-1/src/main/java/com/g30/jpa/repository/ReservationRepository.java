package com.g30.jpa.repository;

import com.g30.jpa.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dmanrique
 */
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
    
}
