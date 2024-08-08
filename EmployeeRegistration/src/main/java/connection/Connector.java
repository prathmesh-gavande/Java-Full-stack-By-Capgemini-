package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Employee_Registration";
		String username="root";
		String pass="prathmesh";
		
		Connection con=DriverManager.getConnection(url, username, pass);
		return con;
	}
}
