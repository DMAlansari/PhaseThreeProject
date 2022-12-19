package com.sporty.shoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hiking {
	@Id
	private Integer serialNumber;
	private String  brand;
	private Integer quantity;
	private String  size;
	
	public Hiking() {
		
	}
	public Hiking(Integer serialNumber, String brand, Integer quantity, String size) {
		super();
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.quantity = quantity;
		this.size = size;
	}
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	

}
