package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post() {
    }

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }

    public Long getId() {
        return id;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
