package com.learning.spring.learningspring.data.repository;

import org.springframework.stereotype.Repository;

import com.learning.spring.learningspring.data.entity.Room;

import org.springframework.data.repository.CrudRepository;
@Repository
public interface RoomRepository extends CrudRepository<Room,Long> {

}
