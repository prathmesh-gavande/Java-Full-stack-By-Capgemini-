package serilizationDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationExample {

	public static void main(String[] args) throws IOException {
		Student s1=new Student(501, "Shubham", "adaf@gmail", "tioeios");
		Student s2=new Student(40, "ram", "ram123", "123");
		Student s3=new Student(100, "shyam", "sham123", "33523");
		
		FileOutputStream fos =new FileOutputStream("C:\\Users\\Prathmesh Gavande\\OneDrive\\Desktop\\Studentdata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		
		oos.close();
		fos.close();
		System.out.println("Data Inserted");
	}

}
