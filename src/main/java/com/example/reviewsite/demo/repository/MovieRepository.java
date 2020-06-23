package com.example.reviewsite.demo.repository;

import com.example.reviewsite.demo.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
