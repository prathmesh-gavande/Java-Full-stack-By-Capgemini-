package array;
import java.util.*;
public class GreedyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int a[][][]=new int [3][4][5];
		System.out.println("Enter the array");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<5;k++) {
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<5;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		

	}

}
