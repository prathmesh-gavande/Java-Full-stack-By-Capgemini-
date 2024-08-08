package comparatorDemo;

import java.util.Comparator;

public class Roll_Comparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getRoll()-o2.getRoll();
	}
	
}
