package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorClass {

	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student_jdbc";
		String username="root";
		String pass="prathmesh";
		
		Connection con = DriverManager.getConnection(url, username, pass);
		
//		if(con!=null) {
//			System.out.print("connected successfully!!");
//		}else {
//			System.out.print("Fail to connect ! try again.");
//		}
		
		return con;
		
		// **********************table*************
//		create database  student_jdbc;
//		use student_jdbc;
//		create table student_table(
//		roll int primary key,
//		name varchar(20),
//		marks int,
//		department varchar(20),
//		contact int,
//		email varchar(20)
//		);
	}

}
