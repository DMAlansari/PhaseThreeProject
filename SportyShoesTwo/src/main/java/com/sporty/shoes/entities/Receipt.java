package com.sporty.shoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Receipt {
	@Id
	private Integer serialNumber;
	private String  date;
	private String  discount;
	private Integer total;

	public Receipt() {
		
	}

	public Receipt(Integer serialNumber, String type) {
		super();
		this.serialNumber = serialNumber;
		
	}
	public Receipt(Integer serialNumber, String date, String discount, Integer total) {
		super();
		this.serialNumber = serialNumber;
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
