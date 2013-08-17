package com.adp.testApp.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adp.testApp.forms.Address;
import com.adp.testApp.forms.Contact;
import com.adp.testApp.forms.Patient;
@Repository
public class ContactDAO implements ContactDAOI {
	
	@Autowired 
	public SessionFactory sessionFactory;
	
	public void addContact(Contact contact) {
		// TODO Auto-generated method stub
		System.out.println("in DAO");
		sessionFactory.openSession().save(contact);
		//sessionFactory.getCurrentSession().getTransaction().commit();
        System.out.println("DAO saved");
	}

	
	public void removeContact(Contact contact) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(contact);

	}

	
	public List<Contact> listContacts() {
		// TODO Auto-generated method stub
	//	return null;
		return sessionFactory.getCurrentSession().createQuery(" from Contact").list();
	}

}
