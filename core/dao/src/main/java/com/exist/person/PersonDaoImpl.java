package com.exist.person;


import java.util.List;
import org.hibernate.Session;
public class PersonDaoImpl {


	public void addPerson(Person person) {
		Session session = HibernatePersistence.getSessionFactory().openSession();
		Integer personID = (Integer) session.save(person);
		session.getTransaction().commit();
	}

	public List<Person> getAllPersons() {
		Session session = HibernatePersistence.getSessionFactory().openSession();
		List<Person> list = session.createCriteria(Person.class).list();
		session.getTransaction().commit();
		return list;
	}



}