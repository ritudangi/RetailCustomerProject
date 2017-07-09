package com.retailmanager.bean;

//Pojo class to set and get the properties
public class ShopAddress {
	private long shopNumber;
	private int shopPostCode;
	private String shopPlace;

	public long getShopNumber() {
		return shopNumber;
	}

	public String getShopPlace() {
		return shopPlace;
	}

	public void setShopPlace(String shopPlace) {
		this.shopPlace = shopPlace;
	}

	public void setShopNumber(long shopNumber) {
		this.shopNumber = shopNumber;
	}

	public int getShopPostCode() {
		return shopPostCode;
	}

	public void setShopPostCode(int shopPostCode) {
		this.shopPostCode = shopPostCode;
	}
}