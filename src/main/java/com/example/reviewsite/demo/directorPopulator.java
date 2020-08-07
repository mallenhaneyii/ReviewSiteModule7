package com.example.reviewsite.demo;

import com.example.reviewsite.demo.models.Director;

import com.example.reviewsite.demo.repository.DirectorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class directorPopulator implements CommandLineRunner {

    @Resource
    private DirectorRepository directorRepo;

    @Override
    public void run(String... args) throws Exception {

        Director favreau = new Director("Jon", "Favreau", "../images/favreau.jpg");
        Director leterrier = new Director("Louis", "Leterrier", "../images/leterrier.jpg");
        Director branagh = new Director("Kenneth", "Branagh", "../images/branagh.jpg");
        Director johnston = new Director("Joe", "Johnston", "../images/johnston.jpg");
        Director whedon = new Director("Joss", "Whedon", "../images/whedon.jpg");
        Director black = new Director("Shane", "Black", "../images/black.jpg");
        Director taylor = new Director("Alan", "Taylor", "../images/taylor.jpg");
        Director gunn = new Director("James", "Gunn", "../images/gunn.jpg");
        Director reed = new Director("Peyton", "Reed", "../images/reed.jpg");
        Director russo = new Director("Anthony and Joe", "Russo", "../images/russo.jpg");
        Director derrickson = new Director("Scott", "Derrickson", "../images/derrickson.jpg");
        Director watts = new Director("Jon", "Watts", "../images/watts.jpg");
        Director waititi = new Director("Taika", "Waititi", "../images/waititi.jpg");
        Director coogler = new Director("Ryan", "Coogler", "../images/coogler.jpg");
        Director boden = new Director("Anna", "Boden", "../images/boden.jpg");
        Director shortland = new Director("Cate", "Shortland", "../images/shortland.jpg");
        directorRepo.save(favreau);
        directorRepo.save(leterrier);
        directorRepo.save(branagh);
        directorRepo.save(johnston);
        directorRepo.save(whedon);
        directorRepo.save(black);
        directorRepo.save(taylor);
        directorRepo.save(gunn);
        directorRepo.save(reed);
        directorRepo.save(russo);
        directorRepo.save(derrickson);
        directorRepo.save(watts);
        directorRepo.save(waititi);
        directorRepo.save(coogler);
        directorRepo.save(boden);
        directorRepo.save(shortland);
    }
}
