package Exceptionhandling.CustomException;

public class ThrowDemo {
	
	public static void marksValidation(double  marks) {
		if (marks<40) {
			throw new ArithmeticException("you fail the exam  ");
		}
		else {
			System.out.println("Tou hava passed the exam");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marksValidation(33);
		System.out.println("program completey executed");
	}
}
