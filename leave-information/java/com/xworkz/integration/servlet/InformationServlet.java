package com.xworkz.integration.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.integration.entity.LeaveEntity;
import com.xworkz.integration.service.LeaveService;
import com.xworkz.integration.service.LeaveServiceImpl;

public class InformationServlet extends HttpServlet {

	private LeaveService<LeaveEntity> service;

	public InformationServlet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Invoked init method");
		this.service = new LeaveServiceImpl();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Invoked post method in ScheduleForm");

		String name = req.getParameter("name");
		String num = req.getParameter("num");
		String reason = req.getParameter("reason");
		String email = req.getParameter("email");
		String date = req.getParameter("date");

		System.out.println(name);
		System.out.println(num);
		System.out.println(reason);
		System.out.println(email);
		System.out.println(date);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();

		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		LeaveEntity entity = new LeaveEntity();
		entity.setName(name);
		entity.setEmail(email);
		entity.setReason(reason);
		entity.setNum(num);
		entity.setDate(date);

		boolean valid = this.service.validateAndSave(entity);
		if (valid) {
			System.out.println("Data is valid");
			writer.println("Registration is successfull for user " + name);
		} else {
			System.out.println("Data is invalid");
			writer.println("Registration is failed");
		}
		writer.println("<b>");
		writer.println("Leave information form is successfully submitted...");
		writer.println("</b>");
		writer.println("</h1>");
		writer.println("</html>");
		writer.println("</body>");

	}

}
