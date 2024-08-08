package com.vaccine;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/add_vaccine_log")
public class AddVaccineLogServlet extends HttpServlet {
  
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int childID = Integer.parseInt(request.getParameter("childID"));
        String vaccineName = request.getParameter("vaccineName");
        java.sql.Date date = java.sql.Date.valueOf(request.getParameter("date"));
        int ageMonths = Integer.parseInt(request.getParameter("ageMonths"));

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO vaccineLogs (childID, vaccineName, date, ageMonths) VALUES (?, ?, ?, ?)");
            ps.setInt(1, childID);
            ps.setString(2, vaccineName);
            ps.setDate(3, date);
            ps.setInt(4, ageMonths);
            ps.executeUpdate();
            response.sendRedirect("hospital_dashboard.jsp?message=Vaccine log added successfully");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("add_vaccine_log.jsp?error=Server Error");
        }
    }
}
