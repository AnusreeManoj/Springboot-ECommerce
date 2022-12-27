package com.webapp.demo.ECommerce;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ECommClass {
	
	@Id
	private String id;
	private String name;
	private String description;
	private String productQuantity;
	private String productPrice;
	private String productType;
	public String getProductId() {
		return id;
	}
	public void setProductId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return name;
	}
	public void setProductName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQuantity() {
		return productQuantity;
	}
	public void setQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getPrice() {
		return productPrice;
	}
	public void setPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getType() {
		return productType;
	}
	public void setType(String productType) {
		this.productType = productType;
	}
	
	
	
}