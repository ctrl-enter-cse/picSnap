package com.prasanna.picSnap.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Post {
	@Id
    private Long id;
    private int userId;
    private String caption;
    private String imageUrl;
    private LocalDateTime createdAt;
    
	public Post() {
		super();
	}
	public Post(Long id, int userId, String caption, String imageUrl, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.caption = caption;
		this.imageUrl = imageUrl;
		this.createdAt = createdAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

  
}
