package strigbuffer;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vcount=0;
		int ccount=0;
		int scount=0;
		String s="Prathmesh Dattatray Gavande";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u') {
				vcount++;
			}else if(ch==' ') {
				scount++;
			}else {
				ccount++;
			}
		}
		System.out.println("length :  "+s.length());
		System.out.println("vowel count:  "+vcount);
		System.out.println("consonant count:  "+ccount);
		System.out.println("space count:  "+scount);
	}

}
