package com.example.reviewsite.demo.repository;

import com.example.reviewsite.demo.models.Director;
import org.springframework.data.repository.CrudRepository;

public interface DirectorRepository extends CrudRepository<Director, Long> {
    Director findDirectorByLastName(String lastName);
}