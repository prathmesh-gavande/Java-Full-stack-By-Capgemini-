package Exceptionhandling;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		
		int a[]=new int [5];
		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<10;i++) {
//			a[i]=sc.nextInt();
//			if(i>4) {
//				try {                                        /// Wrong logic ,Not possible
//					a[i]=sc.nextInt();
//				}catch(Exception e){
//					System.out.println(e);
//				}
//			}
//		}
		try {
			for(int i=0;i<10;i++) {
				a[i]=sc.nextInt();
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		for(int i: a) {
			System.out.print(i+" ");
		}

	}

}
