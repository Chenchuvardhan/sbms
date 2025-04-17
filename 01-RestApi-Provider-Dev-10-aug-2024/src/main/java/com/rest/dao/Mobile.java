package com.rest.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile {
	@Id
	private Integer imei;
	private String companyName;
	private Double mobilePrice;
	private String mobileColor;

	public Integer getImei() {
		return imei;
	}

	public void setImei(Integer imei) {
		this.imei = imei;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(Double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	public String getMobileColor() {
		return mobileColor;
	}

	public void setMobileColor(String mobileColor) {
		this.mobileColor = mobileColor;
	}

	public Mobile(Integer imei, String companyName, Double mobilePrice, String mobileColor) {
		super();
		this.imei = imei;
		this.companyName = companyName;
		this.mobilePrice = mobilePrice;
		this.mobileColor = mobileColor;
	}

	@Override
	public String toString() {
		return "Mobile [imei=" + imei + ", companyName=" + companyName + ", mobilePrice=" + mobilePrice
				+ ", mobileColor=" + mobileColor + "]";
	}

	public Mobile() {
		super();
	}

}
