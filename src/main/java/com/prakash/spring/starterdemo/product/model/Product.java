package com.prakash.spring.starterdemo.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int productId;
	private String productName;
	private int price;
	
	public Product() {
		System.out.println("Product model initilize");
	}
	
	public Product(int productId, String productName, int price) {
		this.productName = productName;
		this.productId = productId;
		this.price = price;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	
}
