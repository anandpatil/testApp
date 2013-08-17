package com.adp.testApp.forms;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
@javax.persistence.Table(name="Address")
public class Address {
	

@Id
@Column(name="addressId")
@GeneratedValue
int addressId;

public int getAddressId() {
	return addressId;
}

public void setAddressId(int addressId) {
	this.addressId = addressId;
}


	
	

	 @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name="patientid",insertable=false, updatable=false, 
                nullable=false)
	
	private Patient patient;
		

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}





	@Column(name="addresstype")
	String addressType;
	
	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
	@Column(name="street1")
	String street1;
	
	
	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	@Column(name="street2")
	String street2;

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	
	
	
}
