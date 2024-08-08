package com.oneToOneHibernate.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient_table")
public class Patient {
	
	@Id
	@Column
	private int pid;
	@Column
	private String pname;
	@Column
	private String dieses;
	@OneToOne(targetEntity = Doctor.class , cascade = CascadeType.ALL)
	private Doctor apointed_doctor;
	@Column
	private double p_contact;
	
	public Patient(int pid, String pname, String dieses, Doctor apointed_doctor, double p_contact) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.dieses = dieses;
		this.apointed_doctor = apointed_doctor;
		this.p_contact = p_contact;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public String getDieses() {
		return dieses;
	}
	public Doctor getApointed_doctor() {
		return apointed_doctor;
	}
	public double getP_contact() {
		return p_contact;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setDieses(String dieses) {
		this.dieses = dieses;
	}
	public void setApointed_doctor(Doctor apointed_doctor) {
		this.apointed_doctor = apointed_doctor;
	}
	public void setP_contact(double p_contact) {
		this.p_contact = p_contact;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", dieses=" + dieses + ", apointed_doctor="
				+ apointed_doctor + ", p_contact=" + p_contact + "]";
	}
	
}
