package array;

public class Example {

	public static void main(String[] args) {
		int a[]=new int [5];
		a[0]=10;
		a[3]=5;
		
		System.out.println(a);   //  -> give address  [I@6f539caf
		// normal for loop
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		// for each loop
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		char ch[]=new char[10];
		ch[0]='P';
		ch[3]='a';
		
		
		System.out.print(ch); // -> P a
		System.out.println();
		for(char i:ch) {
			System.out.print(i+" ");
		}
	}
}
