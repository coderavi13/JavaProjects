package com.ravi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Square
 */
@WebServlet("/Square")
public class Square extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession ses=request.getSession();
		int num=(int)ses.getAttribute("n3");
		
		PrintWriter out=response.getWriter();
		out.println(num*num);
	}

	

}
