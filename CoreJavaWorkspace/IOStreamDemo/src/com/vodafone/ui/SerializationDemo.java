package com.vodafone.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import com.vodafone.model.Person;

public class SerializationDemo {

	public static void main(String[] args) {
		List<Person> persons = List.of(
				new Person("srinivas", 56),
				new Person("john", 45),
				new Person("david", 33)
		);
		
		// try-with-resource		-	resources are automatically closed
		try   ( FileOutputStream fos = new FileOutputStream("person.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			oos.writeObject(persons);
			
		} catch (IOException excep) {
			excep.printStackTrace();
		} 
	}

}
