package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.ConnectorClass;
import entity.Student;

public class StudentDao {
	
	public static int  insert(Student st) throws ClassNotFoundException, SQLException {
		
		Connection con= ConnectorClass.createConnection();
		
		String q="insert into student_table(roll,name,marks,department,contact,email) values(?,?,?,?,?,?)";
		PreparedStatement ps= con.prepareStatement(q);
		ps.setInt(1, st.getRoll());
		ps.setString(2, st.getName());
		ps.setInt(3, st.getMarks());
		ps.setString(4, st.getDepartment());
		ps.setInt(5, st.getContact());
		ps.setString(6, st.getEmail());
		
		int  result=ps.executeUpdate();
		
		return result;
	}
	
	public static void delete(int roll) throws ClassNotFoundException, SQLException {
		Connection con= ConnectorClass.createConnection();
		
		String q="delete from student_table where roll=?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1, roll);
		
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.println("Student Record deleted successfull ! .. ");
		}else {
			System.out.println("Student Roll Number not found. Try again !. . ");
		}
		System.out.println("*****************************");
		System.out.println();
	}
	
	public static void update(Student st) throws ClassNotFoundException, SQLException {
		Connection con= ConnectorClass.createConnection();
		String q="update student_table set name=? , marks=? , department=? ,contact=? , email=? where roll=?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setString(1, st.getName());
		ps.setInt(2, st.getMarks());
		ps.setString(3, st.getDepartment());
		ps.setInt(4, st.getContact());
		ps.setString(5, st.getEmail());
		ps.setInt(6, st.getRoll());
		
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.println("Record Updated successfull ! .. ");
		}else {
			System.out.println("Student roll Number not found. Try again !. . ");
		}
		System.out.println("*****************************");
		System.out.println();
		
	}
	public static void read() throws ClassNotFoundException, SQLException {
		Connection con= ConnectorClass.createConnection();
		
		Statement st=con.createStatement();
		String q="select * from student_table";
		ResultSet rs= st.executeQuery(q);
		System.out.println("roll  |  name  |  marks  |  department  |  contact  |  email");
		while(rs.next()) {
			String roll=rs.getString("roll");
			String name=rs.getString("name");
			String departmet=rs.getString("department");
			String contact=rs.getString("contact");
			String marks=rs.getString("marks");
			String email=rs.getString("email");
			
			System.out.println(roll+"  |  "+ name+"  |  "+marks+"  |  "+departmet+"  |  "+contact+"  |  "+email);
		}
		
	}
}
