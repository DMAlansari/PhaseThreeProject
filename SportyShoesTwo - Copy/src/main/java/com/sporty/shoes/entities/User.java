package com.sporty.shoes.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Tells JPA this is our table
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	private String gender;
	private String wishlist;

	public User() {
	}
	public User(int userId, String userName, String gender, String wishlist) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.wishlist = wishlist;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getWishlist() {
		return wishlist;
	}
	public void setWishlist(String wishlist) {
		this.wishlist = wishlist;
	}

	
}
