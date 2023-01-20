package com.mohith.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("username");
		String uemail = request.getParameter("email");
		String umobile = request.getParameter("mobile");
		out.print("<table><tr> <th>Name</th>  <th>Email</th>  <th>MobileNumber</th>  </tr>");
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp?allowPublicKeyRetrieval=true&useSSL=false","root","123456");
			Statement pst = con.createStatement();
			ResultSet rs = pst.executeQuery("select uname,uemail,umobile from employee where uname= "+uname+"uemail= "+uemail+"umobile= "+umobile);
			while(rs.next()) {
				out.print("<tr><td>");
				out.println(rs.getString(uname));
				out.print("</td>");
				out.print("<tr><td>");
				out.println(rs.getString(uemail));
				out.print("</td>");
				out.print("<tr><td>");
				out.println(rs.getString(umobile));
				out.print("</td>");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		};
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
