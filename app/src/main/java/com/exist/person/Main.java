
package com.exist.person;
import java.util.List;
public class Main {
	public static void main(String[] args) {

		PersonDaoImpl pd = new PersonDaoImpl();

		pd.addPerson(new Person("Carpio","Jim","Mikael"));
		List<Person> list = pd.getAllPersons();

		System.out.println(list.get(0));
		
	}
}