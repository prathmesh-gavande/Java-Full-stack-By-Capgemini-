package entity;

public class Customer {
	private int cid;
	private String cname;
	private double amount;
	private int bill_no;
	
	
	public Customer(int cid, String cname, double amount, int bill_no) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.amount = amount;
		this.bill_no = bill_no;
	}
	
	
	public Customer() {
		super();
	}


	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public double getAmount() {
		return amount;
	}
	public int getBill_no() {
		return bill_no;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", amount=" + amount + ", bill_no=" + bill_no + "]";
	}
	
}
