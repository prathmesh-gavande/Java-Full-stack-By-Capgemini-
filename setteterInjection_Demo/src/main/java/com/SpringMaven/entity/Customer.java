package com.SpringMaven.entity;

public class Customer {
	private int cid;
	private String cname;
	private double amount;
	private int bill_no;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getBill_no() {
		return bill_no;
	}
	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", amount=" + amount + ", bill_no=" + bill_no + "]";
	}
	
	
	
}
