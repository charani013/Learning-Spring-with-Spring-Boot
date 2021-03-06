package com.learning.spring.learningspring.data.repository;


import java.util.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.spring.learningspring.data.entity.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
	
	Iterable<Reservation> findReservationByReservationDate(Date date);
}
