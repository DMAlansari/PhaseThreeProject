package com.sporty.shoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Receipt {
	@Id
	private Integer serialNumber;
	private String  type;
	private String  date;
	private String  discount;
	private Integer total;
	

	
	
	
	public Receipt() {
		
	}
	public Receipt(Integer serialNumber, String type, String date, String discount, Integer total, Integer sneaker) {
		super();
		this.serialNumber = serialNumber;
		this.type = type;
		this.date = date;
		this.discount = discount;
		this.total = total;
		
	
	}
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
	

}
