package com.adp.testApp.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.adp.testApp.forms.Contact;

public interface ContactServiceI {
	
		public void addContact(Contact contact);

		public void removeContact(Contact contact);

		public List<Contact> listContacts();
		

	
}
