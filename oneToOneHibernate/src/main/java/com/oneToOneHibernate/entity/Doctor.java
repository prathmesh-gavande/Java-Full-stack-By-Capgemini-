package com.oneToOneHibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctortable")
public class Doctor {
	@Id
	@Column(name = "did")
	private int did;
	
	@Column
	private String dname;
	
	@Column
	private String spectialist;
	
	@Column
	private double contact;
	
	@OneToOne
	private Patient appointed_patient;
	public Doctor(int did, String dname, String spectialist, double contact, Patient appointed_patient) {
		super();
		this.did = did;
		this.dname = dname;
		this.spectialist = spectialist;
		this.contact = contact;
		this.appointed_patient = appointed_patient;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDid() {
		return did;
	}
	public String getDname() {
		return dname;
	}
	public String getSpectialist() {
		return spectialist;
	}
	public double getContact() {
		return contact;
	}
	public Patient getAppointed_patient() {
		return appointed_patient;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setSpectialist(String spectialist) {
		this.spectialist = spectialist;
	}
	public void setContact(double contact) {
		this.contact = contact;
	}
	public void setAppointed_patient(Patient appointed_patient) {
		this.appointed_patient = appointed_patient;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + ", spectialist=" + spectialist + ", contact=" + contact
				+ ", appointed_patient=" + appointed_patient + "]";
	}
	
	
	
	
}
