package array;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3};
		int a2[]= {4,5,6};
		int a3[]= {7,8,9};
		
		System.out.println("Array before");
		
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]);
		}
		System.out.println();
		
		for(int i=0;i<a1.length;i++) {
			System.out.print(a2[i]);
		}
		System.out.println();
		
		for(int i=0;i<a1.length;i++) {
			System.out.print(a3[i]);
		}
		System.out.println();
		
		for(int i=0;i<a1.length;i++) {
			int temp1=a1[i];
			int temp2=a2[i];
			int temp3=a3[i];
			
			a1[i]=temp3;
			a2[i]=temp1;
			a3[i]=temp2;
		}
		
		System.out.println("Array before");
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]);
		}
		System.out.println();
		
		for(int i=0;i<a1.length;i++) {
			System.out.print(a2[i]);
		}
		System.out.println();
		
		for(int i=0;i<a1.length;i++) {
			System.out.print(a3[i]);
		}
		System.out.println();

	}

}
