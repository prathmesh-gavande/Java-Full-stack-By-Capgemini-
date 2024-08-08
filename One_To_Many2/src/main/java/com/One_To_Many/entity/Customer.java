package com.One_To_Many.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "custable")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int cid;

	@OneToMany(mappedBy = "cust") 
    private List<Orders> order;

	public Customer(int cid, List<Orders> order) {
		super();
		this.cid = cid;
		this.order = order;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setOrder(List<Orders> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", order=" + order + "]";
	}

	
	
	
}
