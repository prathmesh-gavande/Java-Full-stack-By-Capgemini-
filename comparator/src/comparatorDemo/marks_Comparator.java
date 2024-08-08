package comparatorDemo;

import java.util.Comparator;

public class marks_Comparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// Descending Order
		return (int)o2.getMarks()-(int)o1.getMarks();
	}

}
