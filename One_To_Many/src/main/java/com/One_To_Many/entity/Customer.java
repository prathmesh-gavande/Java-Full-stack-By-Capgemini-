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
	@Column
	private String name;
	@Column
	private int profile_no;
	@OneToMany(mappedBy = "cust") // 'cust' should match the field in Orders
    private List<Orders> order;

	public Customer(int cid, String name, int profile_no, List<Orders> order) {
		super();
		this.cid = cid;
		this.name = name;
		this.profile_no = profile_no;
		this.order = order;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public String getName() {
		return name;
	}

	public int getProfile_no() {
		return profile_no;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProfile_no(int profile_no) {
		this.profile_no = profile_no;
	}

	public void setOrder(List<Orders> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", profile_no=" + profile_no + ", order=" + order + "]";
	}
	
	

	
	
}
