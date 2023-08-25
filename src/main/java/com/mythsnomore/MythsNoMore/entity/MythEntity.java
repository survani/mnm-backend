package com.mythsnomore.MythsNoMore.entity;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "myths")
public class MythEntity {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "myth_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "topic")
    private String topic;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "likes")
    private int likes;

    @Column(name = "shocked_factor")
    private int shockedFactor;

    @Column(name = "published_date")
    private LocalDate publishedDate;

    @Column(name = "content", length = 12000)
    private String content;

    @Column(name = "fact", length = 12000)
    private String fact;

    @Column(name = "featured")
    private Boolean featured;



    public MythEntity(Long id, String title, String description, String topic, String imageUrl, int likes, int shockedFactor, LocalDate publishedDate, String content, String fact, Boolean featured) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.topic = topic;
        this.imageUrl = imageUrl;
        this.likes = likes;
        this.shockedFactor = shockedFactor;
        this.publishedDate = publishedDate;
        this.content = content;
        this.fact = fact;
        this.featured = featured;
    }

    public MythEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getShockedFactor() {
        return shockedFactor;
    }

    public void setShockedFactor(int shockedFactor) {
        this.shockedFactor = shockedFactor;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }
}
