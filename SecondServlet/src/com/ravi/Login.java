package com.ravi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname =request.getParameter("username");
		String pwd = request.getParameter("password");
		PrintWriter out=response.getWriter();
		
		if(pwd.equals("ravi"))
		{
			Cookie ck=new Cookie("un",uname);
			response.addCookie(ck);
			out.println(uname);
			response.sendRedirect("Home");
		}
		out.close();
	}

	

}
