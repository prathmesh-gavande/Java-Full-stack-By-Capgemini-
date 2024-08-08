package oops.bankSystem;

public class Bank {
	private long Ac_no;
	long balance;
	private long ATM_pin;
	
	Bank(long Ac_no,long balance,long ATM_pin ){
		this.setAc_no(Ac_no);
		this.balance=balance;
		this.ATM_pin=ATM_pin;
	}
	
	void deposite(int amount) {
		balance+=amount;
	}
	
	void getDetails() {
		System.out.println("Ac_no : "+getAc_no()+ "\nBalance : "+balance+"\nATM_pin : "+ATM_pin);
	}


	public long getAc_no() {
		return Ac_no;
	}

	public void setAc_no(long ac_no) {
		Ac_no = ac_no;
	}
}