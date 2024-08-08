package array;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,3,4,5};
		arr[3]=arr[0]/5;
		arr[4]=arr[2]+50;
		arr[1]=arr[5]*10;
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
