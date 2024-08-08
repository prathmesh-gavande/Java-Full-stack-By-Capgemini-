package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;
import connection.Connector;

public class EmployeeDao {

    public static boolean register(Employee e) throws ClassNotFoundException, SQLException {
        Connection con = Connector.createConnection();
        String q = "INSERT INTO emptable (empid, firstName, lastName, userName, password, address, contact) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, e.getEmpid());
            ps.setString(2, e.getFirstName());
            ps.setString(3, e.getLastName());
            ps.setString(4, e.getUserName());
            ps.setString(5, e.getPassword());
            ps.setString(6, e.getAddress());
            ps.setString(7, e.getContact());

            ps.executeUpdate();
            return false;
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) { // 1062 is the error code for duplicate entry in MySQL
                return true;
            } else {
                throw ex;
            }
        }
    }

    public static void delete(int empid) throws ClassNotFoundException, SQLException {
        Connection con = Connector.createConnection();
        String q = "DELETE FROM emptable WHERE empid=?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, empid);

        int result = ps.executeUpdate();
        if (result > 0) {
            System.out.println("Record deleted successfully!");
        } else {
            System.out.println("Employee ID not found. Try again!");
        }
    }

    public static boolean updateEmployee(Employee e) throws ClassNotFoundException, SQLException {
        Connection con = Connector.createConnection();
        String q = "update emptable set firstName=?, lastName=?, userName=?, password=?, address=?, contact=? where empid=?";
        
        PreparedStatement ps = con.prepareStatement(q);
        ps.setString(1, e.getFirstName());
        ps.setString(2, e.getLastName());
        ps.setString(3, e.getUserName());
        ps.setString(4, e.getPassword());
        ps.setString(5, e.getAddress());
        ps.setString(6, e.getContact());
        ps.setString(7, e.getEmpid());
        
        int result = ps.executeUpdate();
        return result > 0;
    }

    public static List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
        Connection con = Connector.createConnection();
        String q = "SELECT * FROM emptable";
        PreparedStatement ps = con.prepareStatement(q);
        ResultSet rs = ps.executeQuery();

        List<Employee> employees = new ArrayList<>();
        while (rs.next()) {
            Employee e = new Employee();
            e.setEmpid(rs.getString("empid"));
            e.setFirstName(rs.getString("firstName"));
            e.setLastName(rs.getString("lastName"));
            e.setUserName(rs.getString("userName"));
            e.setPassword(rs.getString("password"));
            e.setAddress(rs.getString("address"));
            e.setContact(rs.getString("contact"));

            employees.add(e);
        }
        return employees;
    }
    public static boolean validateUser(String username, String password) throws ClassNotFoundException, SQLException {
        Connection con = Connector.createConnection();
        String q = "SELECT * FROM emptable WHERE username = ? AND password = ?";
        
        PreparedStatement ps = con.prepareStatement(q);
        ps.setString(1, username);
        ps.setString(2, password);
        
        ResultSet rs = ps.executeQuery();
        return rs.next(); // Returns true if a record is found
    }
}
