package com.example.reviewsite.demo.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Star {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String imageUrl;
    private String highlightsUrl;
    @ManyToMany(mappedBy = "stars")
    private Collection<Movie> movies;

    public Long getId() {
        return id;
    }

    public String getFirstName() { return firstName; }

    public String getLastName() {
        return lastName;
    }

    public String getImageUrl() { return imageUrl; }

    public String getHighlightsUrl() { return highlightsUrl; }

    public Collection<Movie> getMovies() {
        return movies;
    }

    public Star() { }

    public Star(String firstName, String lastName, String imageUrl, String highlightsUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.imageUrl = imageUrl;
        this.highlightsUrl= highlightsUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return Objects.equals(id, star.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

