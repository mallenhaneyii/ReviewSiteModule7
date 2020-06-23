package com.example.reviewsite.demo.controllers;

import com.example.reviewsite.demo.models.Movie;
import com.example.reviewsite.demo.repository.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class MovieController {

    @Resource
    private MovieRepository movieRepo;

    @RequestMapping("/movies")
    public String finalAllMovies(Model model) {
        model.addAttribute("movies", movieRepo.findAll());
        return "moviesView";
    }

    @RequestMapping("/movies/{id}")
    public String displaySingleMovie(@PathVariable long id, Model model) {
        Optional<Movie> retrievedMovie = movieRepo.findById(id);
        Movie foundMovie = retrievedMovie.get();
        model.addAttribute("movie", foundMovie);
        return "movieView";
    }

}


