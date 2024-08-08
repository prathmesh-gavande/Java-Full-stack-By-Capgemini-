package com.vaccine;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/delete_vaccine")
public class DeleteVaccineServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM vaccine WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            response.sendRedirect("view_vaccines.jsp?message=Vaccine deleted successfully");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("view_vaccines.jsp?error=Server Error");
        }
    }
}
