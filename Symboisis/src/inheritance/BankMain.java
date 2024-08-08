package inheritance;

public class BankMain {
	public static void main(String []args) {
		Bank s1=new Bank(111111,10000,2222);
		s1.getDetails();
		s1.deposite(500);
		s1.getDetails();
		s1.setAc_no(10303);
		System.out.println(s1.balance);
		s1.getDetails();
	}
}
