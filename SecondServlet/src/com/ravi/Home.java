package com.ravi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

Cookie ck[] = request.getCookies();
PrintWriter out=response.getWriter();

for(Cookie c :ck) {
	if(c.getName().equals("un"))
	{
		out.println(c.getValue());
		//name=
	}
	
	//out.println(name);
}
	}

	
}
