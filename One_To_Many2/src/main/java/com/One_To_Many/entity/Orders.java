package com.One_To_Many.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertabe")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int oid;
	@ManyToOne
    @JoinColumn(name = "cid") 
    private Customer cust;
	public Orders(int oid, Customer cust) {
		super();
		this.oid = oid;
		this.cust = cust;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOid() {
		return oid;
	}
	public Customer getCust() {
		return cust;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", cust=" + cust + "]";
	} 

	
		
}
