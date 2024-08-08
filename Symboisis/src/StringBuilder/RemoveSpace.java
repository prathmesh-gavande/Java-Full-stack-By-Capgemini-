package StringBuilder;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s="  Prathmesh  Gavande  ";
//		or use char array and check the space
//		char a[]=s.toCharArray();
		String ans="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch == ' ') {
				count++;
			}
			else {
				ans+=ch;
			}
		}
		System.out.println("Space count:"+count);
		System.out.println("Sting without Space :"+ans);
	
	}

}
