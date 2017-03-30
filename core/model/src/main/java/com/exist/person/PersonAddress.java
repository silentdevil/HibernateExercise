package com.exist.person;

public class PersonAddress {
	private int id;
	private String blockNumber;
	private String street;
	private String brgy;
	private String city;
	private String zipCode;

	public void setId(int id) {
		this.id = id;
	}

	public void setBlockNumber(String blockNumber) {
		this.blockNumber = blockNumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setBrgy(String brgy) {
		this.brgy = brgy;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public String getBlockNumber() {
		return blockNumber;
	}

	public String getStreet() {
		return street;
	}

	public String getBrgy() {
		return brgy;
	}

	public String getCity() {
		return city;
	}
	
	public String getZipCode() {
		return zipCode;
	}
}
