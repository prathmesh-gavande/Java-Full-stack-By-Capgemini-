package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorClass {

	
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/coustomer_jdbc";
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
//		create database coustomer_jdbc;
//		use coustomer_jdbc;
//
//		create table customer_table(
//		cid int,
//		cname varchar(20),
//		amount decimal(3,3),
//		bill_no int
//		);
	}

}
