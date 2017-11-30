package com.mystudy.hotelservice.repository;

import com.mystudy.hotelservice.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
