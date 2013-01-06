package com.adp.testApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adp.testApp.dao.ContactDAOI;
import com.adp.testApp.forms.Contact;
import com.adp.testApp.services.ContactServiceI;

@Service
public class ContactService implements ContactServiceI {
  
	@Autowired
	public	ContactDAOI contactDAO;
	
	@Transactional
	public void addContact(Contact contact) {
		System.out.println("in services");
		// TODO Auto-generated method stub
		contactDAO.addContact(contact);
	}
	@Transactional
	public void removeContact(Contact contact) {
		// TODO Auto-generated method stub
		contactDAO.removeContact(contact);
	}

	@Transactional
	public List<Contact> listContacts() {
		// TODO Auto-generated method stub
		return contactDAO.listContacts();
	}
	
}
