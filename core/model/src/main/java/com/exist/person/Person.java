package com.exist.person;

import java.util.Date;
import java.util.List;

public class Person {
	private int id;
	private String lastName;
	private String firstName;
	private String middleName;
	private String suffix;
	private String title;
	private PersonAddress personAddress;
	private Date birthday;
	private float gwa;
	private Date dateHired;
	private boolean currentlyEmployed;
	private Contact contact;
	private List<Role> role;

	public Person(String lastName, String firstName, String middleName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPersonAddress(PersonAddress personAddress) {
		this.personAddress = personAddress;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setGwa(float gwa) {
		this.gwa = gwa;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public void setCurrentlyEmployed(boolean currentlyEmployed) {
		this.currentlyEmployed = currentlyEmployed;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public PersonAddress getPersonAddress() {
		return personAddress;
	}

	public Date getBirthday() {
		return birthday;
	}

	public float getGwa() {
		return gwa;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public boolean getCurrentlyEmployed() {
		return currentlyEmployed;
	}

	public Contact getContact() {
		return contact;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setSuffix (String suffix) {
		this.suffix = suffix;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getSuffix() {
		return suffix;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		return String.format("%d\t%s\t%s\t%s\t%s\t%s",
			id,lastName,firstName,middleName,suffix,title);
	}
}