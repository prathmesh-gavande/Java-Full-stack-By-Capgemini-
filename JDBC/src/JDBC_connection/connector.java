package JDBC_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		There are 5 steps to connect any java application with the database using JDBC. These steps are as follows:
//			1.Register the Driver class
//			2.Create connection
//			3.Create statement
//			4.Execute queries
//			5.Close connection
		
		
		
		//Step 1:
		//The forName() method of Class class is used to register the driver class. 
		//This method is used to dynamically load the driver class.
		
		//Class is an interface . 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url="jdbc:mysql://localhost:3306/first_jdbc";
		String username="root";
		String pass="prathmesh";
		
		//Step2
//		Create the connection object
//		The getConnection() method of DriverManager class is used to establish connection with the database.
//		Syntax of getConnection() method
		
		// Connection is also an interface. To create an object of Connection we use DriverManager class method getConnection is use. 
		Connection con=DriverManager.getConnection(url, username, pass);
		
		if(con!=null) {
			System.out.print("Connection created");
		}
		else {
			System.out.print("Try again");
		}
		
	}
}
