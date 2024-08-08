package com.vaccine;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/add_child")
public class AddChildServlet extends HttpServlet {
  
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String childName = request.getParameter("childName");
        String parentName = request.getParameter("parentName");
        String dob = request.getParameter("dob");
        String parentContact = request.getParameter("parentContact");
        String address = request.getParameter("address");

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO child (childName, parentName, dob, parentContact, address) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, childName);
            ps.setString(2, parentName);
            ps.setDate(3, java.sql.Date.valueOf(dob));
            ps.setString(4, parentContact);
            ps.setString(5, address);
            ps.executeUpdate();
            response.sendRedirect("hospital_dashboard.jsp"); // Redirect to the hospital dashboard or any other page
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("add_child.jsp?error=Server Error");
        }
    }
}
