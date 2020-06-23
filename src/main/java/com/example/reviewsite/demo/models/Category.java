package com.example.reviewsite.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String phase;
    private String imageUrl;
    @OneToMany(mappedBy = "category")
    private Collection<Movie> movies;

    public Long getId() { return id; }

    public String getImageUrl() { return imageUrl; }

    public String getPhase() { return phase; }

    public Collection<Movie> getMovies() { return movies; }

    public Category() { }

    public Category(String phase, String imageUrl) {
        this.imageUrl = imageUrl;
        this.phase = phase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
