package com.xworkz.majja.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	
	public RegisterServlet() {
		System.out.println("Created RegisterServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked do post method of RegisterServlet");
		String name=req.getParameter("name");
		String hobbies=req.getParameter("hobbies");
		String email=req.getParameter("email");
		String location=req.getParameter("hobbies");
		
		System.out.println("req values");
		System.out.println(name+ " "+email+" "+hobbies+ " "+location);
		
		if(name!=null && hobbies!=null &&email!=null && location!=null) {
			System.out.println("Registration Successfull");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("/index.jsp");
			
			req.setAttribute("message", "Registration is Successful");
			dispatcher.forward(req, resp);
		}else {
			System.out.println("Registration is failed");
		}
	}

}
