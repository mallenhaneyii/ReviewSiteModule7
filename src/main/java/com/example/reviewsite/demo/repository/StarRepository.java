package com.example.reviewsite.demo.repository;

import com.example.reviewsite.demo.models.Star;
import org.springframework.data.repository.CrudRepository;

public interface StarRepository extends CrudRepository<Star, Long> {
    Star findStarByLastName(String lastName);
}
