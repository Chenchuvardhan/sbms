package com.aramco.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProductDetails")
public class Product {
	@Id
	private Integer productId;
	private String productName;
	private Double productPrice;
	private String productMfgCompany;

	@Override
	public String toString() {
	
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productMfgCompany=" + productMfgCompany + "]";
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductMfgCompany() {
		return productMfgCompany;
	}

	public void setProductMfgCompany(String productMfgCompany) {
		this.productMfgCompany = productMfgCompany;
	}
}
