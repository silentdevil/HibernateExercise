package com.exist.person;

public class Contact {
	private String landLine;
	private String mobile;
	private String email;

	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLandLine() {
		return landLine;
	}

	public String getMobile() {
		return mobile;
	}

	public String getEmail() {
		return email;
	}
}