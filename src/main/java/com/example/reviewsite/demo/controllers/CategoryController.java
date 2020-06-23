package com.example.reviewsite.demo.controllers;


import com.example.reviewsite.demo.models.Category;
import com.example.reviewsite.demo.repository.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class CategoryController {

    @Resource
    private CategoryRepository categoryRepo;

    @RequestMapping({"/categories", "/", ""})
    public String displayCategories(Model model) {
        model.addAttribute("categories", categoryRepo.findAll());
        return "categoriesView";
    }

    @GetMapping("/categories/{phase}")
    public String displaySingleCategory(@PathVariable String phase, Model model) {
        Category retrievedCategory = categoryRepo.findCategoryByPhase(phase);
        model.addAttribute("category", retrievedCategory);
        return "categoryView";
    }
}