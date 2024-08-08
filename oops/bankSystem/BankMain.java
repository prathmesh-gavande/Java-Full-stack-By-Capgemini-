package oops.bankSystem;
public class BankMain {
	public static void main(String []args) {
		Bank s1=new Bank(45678,20000,200);
		s1.getDetails();
		s1.deposite(400);
		s1.getDetails();
		s1.setAc_no(1234);
		System.out.println(s1.balance);
		s1.getDetails();
		Bank s2= new Bank(123,456, 987);
		s2.getDetails();
	}
}