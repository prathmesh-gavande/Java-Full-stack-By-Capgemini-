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
	@Column
	private String order_name;
	@Column
	private double amount;
	@ManyToOne
    @JoinColumn(name = "cid") // Ensure the column name matches the foreign key column in the orders table
    private Customer cust; // Change this to 'customer'

	public Orders(int oid, String order_name, double amount, Customer cust) {
		super();
		this.oid = oid;
		this.order_name = order_name;
		this.amount = amount;
		this.cust = cust;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOid() {
		return oid;
	}

	public String getOrder_name() {
		return order_name;
	}

	public double getAmount() {
		return amount;
	}

	public Customer getCust() {
		return cust;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", order_name=" + order_name + ", amount=" + amount + ", cust=" + cust + "]";
	}
	
		
}
