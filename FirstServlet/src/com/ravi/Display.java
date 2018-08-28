package com.ravi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet	 {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int sq=(int)request.getAttribute("num3");
		sq=sq*sq;
	   PrintWriter out=response.getWriter();
	   out.println("Square of number ="+ sq);
		}
}
