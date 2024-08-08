package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.ConnectorClass;
import entity.Customer;

public class CustomerDao {
	
	public static int insert(Customer c) throws ClassNotFoundException, SQLException {
		Connection con= ConnectorClass.createConnection();
		String q="insert into customer_table(cid,cname,amount,bill_no) values(?,?,?,?)";
		
		// preparedStatement use to Dynamic query insertion
		PreparedStatement ps= con.prepareStatement(q);
		ps.setInt(1, c.getCid());
		ps.setString(2, c.getCname());
		ps.setDouble(3, c.getAmount());
		ps.setInt(4, c.getBill_no());
		
		int  result=ps.executeUpdate();
//		if(result!=true) {
//			System.out.println("Data inserted");
//		}else {
//			System.out.println("Something went wrong!");
//		}
		
		return result;
	}
	
	public static void delete(int cid) throws ClassNotFoundException, SQLException {
		Connection con= ConnectorClass.createConnection();
		
		String q="delete from customer_table where cid=?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1, cid);
		
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.println("Record deleted successfull ! .. ");
		}else {
			System.out.println("Customer id not found. Try again !. . ");
		}
		System.out.println("*****************************");
		System.out.println();
	}
	
	public static void update(Customer c) throws ClassNotFoundException, SQLException {
		Connection con= ConnectorClass.createConnection();
		String q="update customer_table set cname=? ,bill_no=? , amount=? where cid=?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setString(1, c.getCname());
		ps.setInt(2, c.getBill_no());
		ps.setDouble(3, c.getAmount());
		ps.setInt(4, c.getCid());
		
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.println("Record Updated successfull ! .. ");
		}else {
			System.out.println("Customer id not found. Try again !. . ");
		}
		System.out.println("*****************************");
		System.out.println();
		
	}
	
	public static void read() throws ClassNotFoundException, SQLException {
		Connection con= ConnectorClass.createConnection();
		
		Statement st=con.createStatement();
		String q="select * from customer_table";
		ResultSet rs= st.executeQuery(q);
		System.out.println("cid  |  cname  |  amount  |  bill_no");
		while(rs.next()) {
			String cid=rs.getString("cid");
			String cname=rs.getString("cname");
			String amount=rs.getString("amount");
			String bill_no=rs.getString("bill_no");
			
			System.out.println(cid+"  |  "+ cname+"  |  "+amount+"  |  "+ bill_no);
		}
	}
}
