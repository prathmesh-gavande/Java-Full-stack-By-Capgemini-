package CustomThreeException;
import java.util.*;
public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the denominator: ");
		int denominator=sc.nextInt();
		arr[1]=10;
		
		System.out.print("Enter the index: ");
		int index=sc.nextInt();
		try {
			if(denominator == 0) {
				throw new NewZeroException("Divide by zero custom exception");
			}
			else {
				System.out.println("Valid denominator");
			}
		}catch(NewZeroException e) {
			e.printStackTrace();
		}
		try {
			if(index > 4) {
				throw new NewIndexBoundException("Out bound Index");
			}else {
				System.out.println("Valid index");
				System.out.println(arr[index]/denominator);
			}
		}catch (NewIndexBoundException t) {
			t.printStackTrace();
			
		}
		System.out.println("Execution complete");
	}

}
