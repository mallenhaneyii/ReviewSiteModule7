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
    private String trailerUrl;
    @ManyToOne
    private Director director;
    private int releaseYear;
    private int runningTime;
    private String boxOfficeGross;
    @Lob
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

    public String getTrailerUrl() { return trailerUrl; }

    public Director getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getRunningTime() { return runningTime; }

    public String getBoxOfficeGross() { return boxOfficeGross; }

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

    public Movie(String title, String imageUrl, String trailerUrl, Director director, Category category, int releaseYear, int runningTime, String boxOfficeGross, String reviewContent, Star... stars) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.trailerUrl = trailerUrl;
        this.director = director;
        this.category = category;
        this.releaseYear = releaseYear;
        this.runningTime = runningTime;
        this.boxOfficeGross = boxOfficeGross;
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
