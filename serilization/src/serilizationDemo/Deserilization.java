package serilizationDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserilization {
	public static void main(String[]args) throws IOException, ClassNotFoundException {
		FileInputStream fis =new FileInputStream("C:\\Users\\Prathmesh Gavande\\OneDrive\\Desktop\\Studentdata.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Student std=(Student) ois.readObject();
		System.out.println(std);
		
		Student std2=(Student) ois.readObject();
		System.out.println(std2.getName());
		
		Student std3=(Student) ois.readObject();
		System.out.println(std3.getRoll());
	}
}
