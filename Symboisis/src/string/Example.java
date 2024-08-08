package string;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Prathmesh";
		String s1="Gavande";
		
		System.out.println(s.length());
		System.out.println(s.concat(s1));		
		System.out.println(s.concat("gavande"));		
		
		String s2=new String("shirpur");
		System.out.println(s2);
		s2="Nanadurbar";
		System.out.println(s2);
		System.out.println(s2.charAt(2));
		
		System.out.println(s2.contains("an"));
		System.out.println(s2.endsWith("a"));
		System.out.println(s2.toUpperCase());
		System.out.println(s2);

	}

}
