package com.example.reviewsite.demo.controllers;

import com.example.reviewsite.demo.models.Director;
import com.example.reviewsite.demo.repository.DirectorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class DirectorController {

    @Resource
    private DirectorRepository directorRepo;

    @RequestMapping({"/directors"})
    public String displayDirectors(Model model) {
        model.addAttribute("directors", directorRepo.findAll());
        return "directorsView";
    }

    @GetMapping("/directors/{lastName}")
    public String displaySingleDirector(@PathVariable String lastName, Model model) {
        Director retrievedDirector = directorRepo.findDirectorByLastName(lastName);
        model.addAttribute("director", retrievedDirector);
        return "directorView";
    }
}
