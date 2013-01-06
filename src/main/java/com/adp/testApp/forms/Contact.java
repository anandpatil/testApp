package com.adp.testApp.forms;

import javax.persistence.Entity;
import javax.persistence.*;



@Entity
@javax.persistence.Table (name="contacts")
public class Contact {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	public Contact(){
	}
	@Column(name="firstname")
	private String firstname;
	public String getFirstname() {
		return firstname;
	} 
	public void setFirstname(String name) {
		this.firstname = name;
	}
	@Column (name="telephone")
	private String phone;
	public String getTelephone() {
		return phone;
	}
	public void setTelephone(String phone) {
		this.phone = phone;
	}
	

}