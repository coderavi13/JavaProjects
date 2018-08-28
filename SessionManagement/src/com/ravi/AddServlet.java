package com.ravi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Addition", urlPatterns = { "/Addition" })
public class AddServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int i=Integer.parseInt(req.getParameter("n1"));
		int j=Integer.parseInt(req.getParameter("n2"));
		int k=i+j;
		
		HttpSession ses=req.getSession();
		ses.setAttribute("n3",k);
		res.sendRedirect("square");
		
		
	}

}
