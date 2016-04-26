package base;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {

	@Test
	public void testInsert() {
		PersonDomainModel test_person = new PersonDomainModel();
		
		test_person.setBirthday(LocalDate.of(1990, 4, 10));
		test_person.setFirstName("Alexander");
		test_person.setLastName("The Great");
		test_person.setStreet("100 Ancient Ave.");
		test_person.setCity("Athens");
		test_person.setPostalCode(11111);
		
		//This method should return the element added if it added it correctly
		assertTrue(PersonDAL.addPerson(test_person)==test_person);
		
	}
	@Test
	
	public void testDelete() {
		PersonDomainModel test_person = new PersonDomainModel();
		
		test_person.setBirthday(LocalDate.of(1990, 4, 10));
		test_person.setFirstName("Alexander");
		test_person.setLastName("The Great");
		test_person.setStreet("100 Ancient Ave.");
		test_person.setCity("Athens");
		test_person.setPostalCode(11111);
		
		//First add the person and check if he is there
		PersonDAL.addPerson(test_person);
		assertTrue(PersonDAL.getPerson(test_person.getPersonID())==test_person);
	
		//Then delete the person and check if he is gone
		PersonDAL.deletePerson(test_person.getPersonID());
		assertTrue(PersonDAL.getPerson(test_person.getPersonID())==null);
	}
	
	@Test
	public void testRead(){
		PersonDomainModel test_person = new PersonDomainModel();
		
		test_person.setBirthday(LocalDate.of(1990, 4, 10));
		test_person.setFirstName("Alexander");
		test_person.setLastName("The Great");
		test_person.setStreet("100 Ancient Ave.");
		test_person.setCity("Athens");
		test_person.setPostalCode(11111);
		
		//First add the person and check if he is there
		PersonDAL.addPerson(test_person);
		assertTrue(PersonDAL.getPerson(test_person.getPersonID())==test_person);
		
		//Use the get method to read the person
		//Test whether it returns the same person
		assertTrue(PersonDAL.getPerson(test_person.getPersonID())==test_person);
	}
	
	@Test
	public void testUpdate(){
		PersonDomainModel test_person = new PersonDomainModel();
		
		test_person.setBirthday(LocalDate.of(1990, 4, 10));
		test_person.setFirstName("Alexander");
		test_person.setLastName("The Great");
		test_person.setStreet("100 Ancient Ave.");
		test_person.setCity("Athens");
		test_person.setPostalCode(11111);
		
		//First add the person and check if he is there
		PersonDAL.addPerson(test_person);
		assertTrue(PersonDAL.getPerson(test_person.getPersonID())==test_person);
		
		//Test the return of the update method
		assertTrue(PersonDAL.updatePerson(test_person)==test_person);
	}
	

}
