package array;

import java.util.Scanner;

public class D4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][][][]=new int [3][4][5][6];
		Scanner sc=new Scanner (System.in);
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<5;k++) {
					for(int l=0;l<6;l++) {
						a[i][j][k][l]=sc.nextInt();
					}
				}
			}
		}
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<5;k++) {
					for(int l=0;l<6;l++) {
						System.out.print(a[i][j][k][l]+" ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
