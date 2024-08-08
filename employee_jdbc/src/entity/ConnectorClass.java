package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorClass {
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/image_jdbc";
		String username="root";
		String pass="prathmesh";
		
		Connection con = DriverManager.getConnection(url, username, pass);
		
		return con;
		
		// **********************table*************
//		create database image_jdbc;
//		use image_jdbc;
//		create table image_table(
//		emp_id int,
//		emp_name varchar(20),
//		image longblob
//		);
	}
}
