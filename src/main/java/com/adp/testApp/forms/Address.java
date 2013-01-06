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
	@Column(name="patient_add_id")
	int patient_add_id;
	
	public int getPatient_add_id() {
		return patient_add_id;
	}

	public void setPatient_add_id(int id) {
		this.patient_add_id = id;
	}
	
	@ManyToOne//(cascade = {CascadeType.PERSIST})
    //@org.hibernate.annotations.Cascade(value = org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "patientid", nullable = false, insertable=false,updatable=false)
	private Patient patient;
		

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
