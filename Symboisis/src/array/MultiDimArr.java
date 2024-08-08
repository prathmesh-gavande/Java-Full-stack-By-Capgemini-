package array;
import java.util.*;
public class MultiDimArr {

	public static void main(String[] args) {
		
		// 2D matrix declaration 
//		int a[][];
//		int []a[];
//		int [][]a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int row=sc.nextInt();

		System.out.println("Enter the numbers of col: ");
		int col=sc.nextInt();
		
		int arr[][]=new int [row][col];
		
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Entered elements in array: ");
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose array: ");
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

	}

}
