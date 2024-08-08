package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;
import com.entity.Employee;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String empid = request.getParameter("empid");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        
        Employee e = new Employee();
        e.setEmpid(empid);
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setUserName(userName);
        e.setPassword(password);
        e.setAddress(address);
        e.setContact(contact);
        
        boolean isUpdated = false;
		try {
			isUpdated = EmployeeDao.updateEmployee(e);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        if (isUpdated) {
            response.sendRedirect("success.jsp");
        } else {
            response.sendRedirect("updateEmployee.jsp?error=notfound");
        }
    }

}
