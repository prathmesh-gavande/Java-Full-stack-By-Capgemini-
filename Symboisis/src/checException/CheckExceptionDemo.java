package checException;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class CheckExceptionDemo {
	
	public static void readFile() throws FileNotFoundException {
//		FileReader fr = new FileReader("C://Users//Prathmesh Gavande//OneDrive//Desktop//techie.txt");
//		BufferedReader fileinput= new BufferedReader(fr);
//		System.out.println(fileinput);
		
//		try {
//			
////			String line=fileinput.readLine();
////			System.out.println(line);
//			
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//;		}
		
		
		File myObj = new File("C://Users//Prathmesh Gavande//OneDrive//Desktop//techie.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      
		
//		throw new FileNotFoundException();
	}
	
	public static  void createFile() throws IOException {
		FileWriter myObj = new FileWriter("C://Users//Prathmesh Gavande//OneDrive//Desktop//techie.txt");
		
		String data="Prathmesh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		myObj.write(data);
		myObj.append("\najsdlajlkfajldkja");
		myObj.close();
	      
	}
	
	public static void main(String[] args) throws IOException {
		
		try {
			createFile();
			readFile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("code run ");
	}

}
