package string;

public class ImmutableMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Immutable obj=new Immutable("Prathmesh");
//		
		System.out.println(obj.getS());
//		obj.s="ram";
//		System.out.print(obj.s);
		obj=new Immutable("parag");
		System.out.println(obj.getS());

	}

}
