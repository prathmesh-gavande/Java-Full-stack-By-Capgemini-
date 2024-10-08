package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Bookdao;
import com.entity.Book;

@WebServlet("/addBookServlet")
public class addBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public addBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		double price=Double.parseDouble(request.getParameter("price"));
		Book book=new Book( title, author, price);
		
		boolean result=Bookdao.save(book);
		if(!result) {
			System.out.print("Book added successfully");
		}else {
			System.out.print("something went wrong");
		}
		
		response.sendRedirect("bookList.jsp");
	}

}



//package com.servlet;
//
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.dao.Bookdao;
//import com.entity.Book;
//
//@WebServlet("/addBookServlet")
//public class addBookServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//   private Bookdao bookdao=new Bookdao();
//   
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		// TODO Auto-generated method stub
////		doGet(request, response);
//		
//		String title=request.getParameter("title");
//		String author=request.getParameter("author");
//		double price=Double.parseDouble(request.getParameter("price"));
//		Book book=new Book( title, author, price);
//		
//		boolean result=Bookdao.save(book);
//		if(!result) {
//			System.out.print("Book added successfully");
//		}else {
//			System.out.print("something went wrong");
//		}
//		
//		response.sendRedirect("bookList.jsp");
//	}
//
//}
