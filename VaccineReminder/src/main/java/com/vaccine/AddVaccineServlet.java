package com.vaccine;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/add_vaccine")
public class AddVaccineServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vaccineName = request.getParameter("vaccineName");
        String vaccineDetails = request.getParameter("vaccineDetails");
        double price = Double.parseDouble(request.getParameter("price"));
        int months = Integer.parseInt(request.getParameter("months"));

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO vaccine (vaccineName, vaccineDetails, price, months) VALUES (?, ?, ?, ?)");
            ps.setString(1, vaccineName);
            ps.setString(2, vaccineDetails);
            ps.setDouble(3, price);
            ps.setInt(4, months);
            ps.executeUpdate();
            response.sendRedirect("hospital_dashboard.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("add_vaccine.jsp?error=Server Error");
        }
    }
}