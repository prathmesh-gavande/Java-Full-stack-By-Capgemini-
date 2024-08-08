package array;

public class Pallindrome {
	static int count=0;
	public static void main(String[] args) {
		int arr[]= {22,41,34,121};
		for(int i=0;i<arr.length;i++) {
			pallindrome(arr[i]);
		}
		System.out.print(count);
		
	}
	
	static void pallindrome(int num) {
		int num2=num;
		int num3=0;
		while(num!=0) {
			int rem=num%10;
			num3=num3*10+rem;
			num=num/10;
		}
		if(num2==num3) {
			count++;
		}
	}

}
