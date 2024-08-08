package com.vaccine;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/update_vaccine")
public class UpdateVaccineServlet extends HttpServlet {
  
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String vaccineName = request.getParameter("vaccineName");
        String vaccineDetails = request.getParameter("vaccineDetails");
        double price = Double.parseDouble(request.getParameter("price"));
        int months = Integer.parseInt(request.getParameter("months"));

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE vaccine SET vaccineName=?, vaccineDetails=?, price=?, months=? WHERE id=?");
            ps.setString(1, vaccineName);
            ps.setString(2, vaccineDetails);
            ps.setDouble(3, price);
            ps.setInt(4, months);
            ps.setInt(5, id);
            ps.executeUpdate();
            response.sendRedirect("view_vaccines.jsp?message=Vaccine updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("edit_vaccine.jsp?id=" + id + "&error=Server Error");
        }
    }
}
