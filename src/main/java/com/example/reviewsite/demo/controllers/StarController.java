package com.example.reviewsite.demo.controllers;

import com.example.reviewsite.demo.models.Star;
import com.example.reviewsite.demo.repository.StarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StarController {

    @Resource
    private StarRepository starRepo;

    @RequestMapping({"/stars"})
    public String displayStars(Model model) {
        model.addAttribute("stars", starRepo.findAll());
        return "starsView";
    }

    @GetMapping("/stars/{lastName}")
    public String displaySingleStar(@PathVariable String lastName, Model model) {
        Star retrievedStar = starRepo.findStarByLastName(lastName);
        model.addAttribute("star", retrievedStar);
        return "starView";
    }
}