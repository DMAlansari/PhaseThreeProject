package com.sporty.shoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Purchased {
	@Id
	private Integer serialNumber;
	private String  brand;
	private String  type;
	private String  size;
	
	@ManyToOne
	private Receipt receipt;
	
	
	public Receipt getReceipt() {
		return receipt;
	}
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
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
	public Purchased(Integer serialNumber, String brand, String type, String size, Integer receiptSerialNumber) {
		super();
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.type = type;
		this.size = size;
		
		this.receipt = new Receipt(receiptSerialNumber, "" ,"",null);
	}
	
//	public Purchased(Integer serialNumber, String brand, String type, String size, Integer receiptSerialNumber, String date) {
//		super();
//		this.serialNumber = serialNumber;
//		this.brand = brand;
//		this.type = type;
//		this.size = size;
//		
//		this.receipt = new Receipt(receiptSerialNumber, date ,"",null);
//	}
//	
	
}
