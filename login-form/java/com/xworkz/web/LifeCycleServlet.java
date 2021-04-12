package com.xworkz.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycleServlet extends GenericServlet{

	
	public LifeCycleServlet() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Invoked init method from LifeCycleServlet");
		
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("Invoked service in LifeCycleServlet");
		String uname = req.getParameter("uname");
		String secret = req.getParameter("secret");
		System.out.println(uname);
		System.out.println(secret);

		res.setContentType("text/html");
		
		PrintWriter writer = res.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Login Success  " + uname);
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");

	}

	@Override
	public void destroy() {
		System.out.println("Invoked destroy method in LifeCycleServlet");
	}
	
	
}
