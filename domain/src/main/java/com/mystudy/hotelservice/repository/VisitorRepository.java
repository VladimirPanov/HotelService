package com.mystudy.hotelservice.repository;

import com.mystudy.hotelservice.model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
}
