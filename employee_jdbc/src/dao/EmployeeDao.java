package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.ConnectorClass;
import entity.Employee;

public class EmployeeDao {
	public static void insert(Employee e) throws ClassNotFoundException, SQLException, FileNotFoundException {
		Connection con= ConnectorClass.createConnection();
		String q="insert into image_table values(?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1, e.getEmp_id());
		ps.setString(2, e.getEmp_name());
		FileInputStream fis=new FileInputStream("D://image.jpg");
		ps.setBinaryStream(3, fis);
		boolean result=ps.execute();
		if(result==false) {
			System.out.println("Data inserted");
		}else {
			System.out.println("Try again!");
		}
	}
	public static void delete(int emp_id) throws ClassNotFoundException, SQLException {
		Connection con= ConnectorClass.createConnection();
		
		String q="delete from image_table where emp_id=?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1, emp_id);
		
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.println("Record deleted successfull ! .. ");
		}else {
			System.out.println(" id not found. Try again !. . ");
		}
		System.out.println("*****************************");
		System.out.println();
	}
	public static void update(Employee e) throws ClassNotFoundException, SQLException, FileNotFoundException {
		Connection con= ConnectorClass.createConnection();
		
		String q="update image_table set  emp_name=?, image=? where emp_id=?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(3, e.getEmp_id());
		ps.setString(1, e.getEmp_name());
		FileInputStream fis=new FileInputStream("D://passport_photo.png");
		ps.setBinaryStream(2, fis);
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.println("Updated Successfully!");
		}else {
			System.out.println("try again!");
		}
	}
	public static void read(int emp_id) throws ClassNotFoundException, SQLException, IOException {
		Connection con= ConnectorClass.createConnection();
		String path="C://Users/Prathmesh Gavande/OneDrive/Desktop/TSS/image.jpg";
		Statement st=con.createStatement();
		String q="select * from image_table where emp_id = ?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1, emp_id);
		ResultSet rs= st.executeQuery(q);
		while(rs.next()) {
			InputStream is=rs.getBinaryStream("image");
			OutputStream fos =new FileOutputStream(path);
			byte[] buffer =new byte[4096];
			int bytesread;
			while((bytesread=is.read(buffer))!=-1) {
				fos.write(buffer,0,bytesread);
			}
			
			is.close();
			fos.close();
		}
	}
}
