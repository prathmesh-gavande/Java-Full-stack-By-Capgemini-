package JDBC_connection;
import java.sql.*;

public class JDBCConnection {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/firstdb";
		String username="root";
		String pass="prathmesh";
		String query="Select * from student where roll=1";
//		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username, pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		rs.next();
		String name=rs.getString(3);
		System.out.println(name);
		st.close();
		con.close();
	}

}

// rollNo,name,marks, department,contact,email