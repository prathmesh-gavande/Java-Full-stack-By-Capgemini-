package StringBuilder;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Time required for StringBuffer for same task");
		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("Java");
		for(int i=0;i<10000;i++) {
				sb.append("Programming");
		}
		System.out.println(System.currentTimeMillis()-startTime+" ms");
		
		
		System.out.println("Time required for StringBuilder for same task");
		startTime=System.currentTimeMillis();
		StringBuilder sbd=new StringBuilder("Java");
		for(int i=0;i<10000;i++) {
				sbd.append("Programming");
		}
		System.out.println(System.currentTimeMillis()-startTime+" ms");
		
		System.out.println("Time required for String for same task");
		startTime=System.currentTimeMillis();
		String s="Java";
		for(int i=0;i<10000;i++) {
				s+="Programming";
		}
		System.out.println(System.currentTimeMillis()-startTime+" ms");
		System.out.println("=================================================");
	}

}
