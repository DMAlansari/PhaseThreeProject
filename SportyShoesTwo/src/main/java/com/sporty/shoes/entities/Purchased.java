package com.sporty.shoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Purchased {
	@Id
	private Integer serialNumber;
	private String  brand;
	private String  type;
	private String  size;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public Purchased() {
		
	}
	public Purchased(Integer serialNumber, String brand, String type, String size) {
		super();
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.type = type;
		this.size = size;
	}
	
	
}
