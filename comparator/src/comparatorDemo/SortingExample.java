package comparatorDemo;

import java.util.Collections;
import java.util.LinkedList;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> st=new LinkedList<Student>();
		st.add(new Student(101,"ram",67.3,12356));
		st.add(new Student(1003,"Parag",66.3,126789));
		st.add(new Student(104,"rohan",65.3,124789));
		st.add(new Student(1,"shyam",60.3,1289));
		
		System.out.println(st);
		System.out.println("=============================================");
		System.out.println(st.toString()); 
		System.out.println("=============================================");
		System.out.println("********************Sorted using roll.no********************");
		Collections.sort(st,new Roll_Comparator());
		System.out.println(st.toString()); 
		System.out.println("=============================================");
		
		System.out.println("********************Sorted using name********************");
		Collections.sort(st,new Name_Comparator());
		System.out.println(st.toString()); 
		System.out.println("=============================================");
		
		System.out.println("********************Decresing order Sorted using Marks********************");
		Collections.sort(st,new marks_Comparator());
		System.out.println(st.toString()); 
		System.out.println("=============================================");
	}

}
