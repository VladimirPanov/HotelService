package com.mystudy.hotelservice.repository;

import com.mystudy.hotelservice.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
