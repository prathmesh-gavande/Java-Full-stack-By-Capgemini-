package com.Hibernate_Meaven.entity;

public class Customer {
	private int cid;
	private String name;
	private double amount;
	private String vehical_no;
	public Customer(int cid, String name, double amount, String vehical_no) {
		super();
		this.cid = cid;
		this.name = name;
		this.amount = amount;
		this.vehical_no = vehical_no;
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
	public double getAmount() {
		return amount;
	}
	public String getVehical_no() {
		return vehical_no;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setVehical_no(String vehical_no) {
		this.vehical_no = vehical_no;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", amount=" + amount + ", vehical_no=" + vehical_no + "]";
	}
	
	
	
}


