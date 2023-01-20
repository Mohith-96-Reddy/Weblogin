package com.mohith.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("pass");
		String reupwd = request.getParameter("re_pass");
		String umobile = request.getParameter("contact");
		RequestDispatcher dispatcher= null;
		Connection con = null;
		if(uname==null || uname.equals("")) {
			request.setAttribute("status", "InvalidName");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}
		if(uemail==null || uemail.equals("")) {
			request.setAttribute("status", "InvalidEmail");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}
		if(upwd==null || upwd.equals("")) {
			request.setAttribute("status", "InvalidPassword");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}else if(!upwd.equals(reupwd)){
			request.setAttribute("status", "InvalidConfirmPassword");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}
		if(umobile==null || umobile.equals("")) {
			request.setAttribute("status", "InvalidMobile");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}else if(umobile.length()>10){
			request.setAttribute("status", "InvalidMobileno");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp?allowPublicKeyRetrieval=true&useSSL=false","root","123456");
			PreparedStatement pst = con.prepareStatement("insert into employee(uname,upwd,uemail,umobile)values(?,?,?,?)");
			pst.setString(1,uname);
			pst.setString(2,upwd);
			pst.setString(3,uemail);
			pst.setString(4,umobile);
			int rowCount=pst.executeUpdate();
			dispatcher =request.getRequestDispatcher("registration.jsp");
			if(rowCount>0) {
				request.setAttribute("status", "Success");
			}
			else {
				request.setAttribute("status", "Failed");
			}
			dispatcher.forward(request, response);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
