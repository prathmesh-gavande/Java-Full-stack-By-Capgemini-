package Matrix;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		int[][] arr1=new int[3][3];
		int[][] arr2=new int[3][3];
		int[][] ans=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first array: ");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second array: ");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				ans[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Output: ");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println("");
		}

	}
}
