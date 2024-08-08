package array;
import java.util.*;
public class EvnOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int j=0;
		System.out.println("Enter the number of elements: ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<len;i++){
			int val=sc.nextInt();
			if(val%2==0) {
				arr[j]=val;
				j++;
			}
		}
		
		System.out.println("Even numbers : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		sc.close();  // distructor  not compulsary because java has memory management using garbage collection 
	}

}
