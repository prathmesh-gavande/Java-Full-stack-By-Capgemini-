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

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EmployeeDao employeeDao;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
//		super.init();
		employeeDao =new EmployeeDao();
	}
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid=request.getParameter("empid");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
		Employee e=new Employee();
		e.setEmpid(empid);
		e.setFirstName(firstName);
		e.setLastName(lastName);
		e.setUserName(userName);
		e.setPassword(password);
		e.setAddress(address);
		e.setContact(contact);
		
//		try {
//			boolean result= EmployeeDao.register(e);
//			
//			if(result==false) {
//				response.sendRedirect("success.jsp");
//			}
//			else {
//				response.sendRedirect("registerEmployee.jsp");
//			}
//		} catch (ClassNotFoundException e2) {
//			// TODO: handle exception
//			e2.printStackTrace();
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		try {
            boolean isDuplicate = employeeDao.register(e);
            if (!isDuplicate) {
                response.sendRedirect("success.jsp");
            } else {
                response.sendRedirect("registerEmployee.jsp?error=duplicate");
            }
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
            response.sendRedirect("registerEmployee.jsp?error=server");
        }
	}

}
//<% request.getContextPath(); %>/register