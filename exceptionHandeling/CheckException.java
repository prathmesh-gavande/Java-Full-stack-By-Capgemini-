package com.exceptionHandeling;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;

public class CheckException {

		
	public static void readFile() throws FileNotFoundException{
			
		FileReader fr=new FileReader("C:\\Users\\PRATHAMESH\\Desktop\\abcd.txt");
		BufferedReader fileinput =new BufferedReader(fr);
		System.out.println(fileinput);
		File MyObj=new File("C:\\Users\\PRATHAMESH\\Desktop\\abcd.txt");
		Scanner myReader=new Scanner(MyObj);
		while(myReader.hasNextLine()){
			String Data=myReader.nextLine();
			System.out.println(Data);
		}
		//throw new FileNotFoundException();
		
		
		
	}

	public static void createFile() throws IOException{
		FileWriter fr1= new FileWriter("C:\\Users\\PRATHAMESH\\Desktop\\abcd.txt");
		String data="Hello Word My name Is Parag ";
		fr1.write(data);
		fr1.append("Hii..");
		fr1.close();
		
	}
	
	
	
	public static void main(String[] args) {
		try {
			createFile();
			readFile();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Code Run Properly");
	}
	

}
