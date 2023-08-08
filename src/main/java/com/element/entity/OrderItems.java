package com.element.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productNumber;
	private String productDescription;
	private int productQty;
	private Long productPrice;
	public Long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Long productNumber) {
		this.productNumber = productNumber;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	public Long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
	public OrderItems(Long productNumber, String productDescription, int productQty, Long productPrice) {
		super();
		this.productNumber = productNumber;
		this.productDescription = productDescription;
		this.productQty = productQty;
		this.productPrice = productPrice;
	}
	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderItems [productNumber=" + productNumber + ", productDescription=" + productDescription
				+ ", productQty=" + productQty + ", productPrice=" + productPrice + "]";
	}
	
	

}
