package com.habibzad.junit;

public class ContactApp {

	public static void main(String[] args) {
		ContactManager app = new ContactManager();
		
		app.addContact("John", "Doe", "0515001212");
		app.addContact("Jane", "Doe", "0515002020");
		app.addContact("Joe", "Doe", "0515001200");
		
		for(Contact contact: app.getAllContacts()) {
			System.out.println(contact);
		}

	}

}
