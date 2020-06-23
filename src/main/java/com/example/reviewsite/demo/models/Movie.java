package com.example.reviewsite.demo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String imageUrl;
    @ManyToOne
    private Director director;
    private String releaseYear;
    private String reviewContent;
    @ManyToOne
    private Category category;
    @ManyToMany
    private Collection<Star> stars;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Director getDirector() {
        return director;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public Category getCategory() {
        return category;
    }

    public Collection<Star> getStars() {
        return stars;
    }

    public Movie() {
    }

    public Movie(String title, String imageUrl, Director director, Category category, String releaseYear,  String reviewContent, Star...stars) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.director = director;
        this.category = category;
        this.releaseYear = releaseYear;
        this.reviewContent = reviewContent;
        this.stars = new ArrayList<>(Arrays.asList(stars));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie director = (Movie) o;
        return Objects.equals(id, director.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
