package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.Employee;
import test.entity.ConnectorClass;


public class ImageDao {
	
	public static void insert() throws ClassNotFoundException, SQLException, FileNotFoundException {
		Connection con= ConnectorClass.createConnection();
		String q="insert into image_table values(?)";
		
		PreparedStatement ps=con.prepareStatement(q);

		FileInputStream fis=new FileInputStream("D://image.jpg");
		ps.setBinaryStream(1, fis);
		boolean result=ps.execute();
		if(result==false) {
			System.out.println("Data inserted");
		}else {
			System.out.println("Try again!");
		}
	}

}
