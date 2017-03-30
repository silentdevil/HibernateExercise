package com.exist.person;

import java.util.List;

public interface PersonDao {
	public List<Person> getAllPersons();
	public Person getPerson(int id);
	public void updatePerson(Person person);
	public void deletePerson(Person person);
	public void addPerson(Person person);
}
