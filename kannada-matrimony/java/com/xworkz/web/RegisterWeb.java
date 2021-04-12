package com.xworkz.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterWeb extends HttpServlet {

	public RegisterWeb() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("invoked doGet method from Register");
		System.out.println(req);
		String firstNameFromReq = req.getParameter("fname");
		System.out.println(firstNameFromReq);
		String lastNameFromReq = req.getParameter("lname");
		System.out.println(lastNameFromReq);
		String emailFromReq = req.getParameter("email");
		System.out.println(emailFromReq);
		String passwordFromReq = req.getParameter("password");
		System.out.println(passwordFromReq);
		String confirmPasswordFromReq = req.getParameter("cpassword");
		System.out.println(confirmPasswordFromReq);

		resp.setContentType("Text/html");

		PrintWriter writter = resp.getWriter();
		writter.println("<html>");
		writter.println("<body>");
		writter.println("<h1>");
		writter.println("<b>");
		writter.println("Registration Successful for " + firstNameFromReq + " " + lastNameFromReq);
		writter.println("</b>");
		writter.println("</h1>");
		writter.println("</body>");
		writter.println("</html>");
		writter.flush();

	}

}
