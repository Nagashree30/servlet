package com.xworkz.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public LoginServlet() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Invoke post from LoginServlet");

		String uname = req.getParameter("uname");
		String secret = req.getParameter("secret");
		System.out.println(uname);
		System.out.println(secret);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Login Success  " + uname);
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");

	}

}
