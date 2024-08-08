package array;

public class BlankIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [5];
		a[0]=10;
		a[3]=5;
		a[2]=11;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				System.out.println(i+ "");
			}
		}
	}

}
