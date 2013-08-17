package com.adp.testApp.forms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import org.hibernate.annotations.IndexColumn;

@Entity
@javax.persistence.Table(name="patient")
public class Patient {

	@Id
	@Column(name="patientid")
	@GeneratedValue
	private int patientid;
	
	public int getPatientId() {
		return patientid;
	}

	public void setPatientId(int id) {
		this.patientid = id;
	}
@Column(name="pfname")
	String firstname;
	
	public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}
	@Column(name="lname")
	String lastname;
	

//	@OneToMany(cascade={CascadeType.ALL})
//    @JoinColumn(name="patientid")
//    @IndexColumn(name="idx")
	// @OneToMany(mappedBy="patient")
	 @OneToMany(fetch=FetchType.EAGER)
	    @JoinColumn(name="patientid", nullable=false)
List <Address>addresses= new ArrayList();

	public List<Address> getAddress() {
	return addresses;
}

public void setAddress(List<Address> addresses) {
	
	this.addresses = addresses;
}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	
	
	
	
}
