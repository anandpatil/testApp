package com.adp.testApp.forms;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@javax.persistence.Table(name="patient")
public class Patient {

	@Id
	@Column(name="patientid")
	@GeneratedValue
	int patientid;
	
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
	
	@OneToMany(mappedBy="patient")
Set <Address>address= new HashSet<Address>();

	public Set<Address> getAddress() {
	return address;
}

public void setAddress(Set<Address> address) {
	this.address = address;
}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
	
}
