package com.xworkz.integration.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.integration.dao.ContactDAO;
import com.xworkz.integration.dao.ContactDAOImpl;
import com.xworkz.integration.entity.ContactEntity;
import com.xworkz.integration.service.ContactService;
import com.xworkz.integration.service.ContactServiceImpl;

public class ScheduleForm extends HttpServlet {

	private ContactService<ContactEntity> service;

	public ScheduleForm() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Invoked init method");
		this.service = new ContactServiceImpl();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Invoked post method in ScheduleForm");

		String name = req.getParameter("name");
		String company = req.getParameter("company");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String about = req.getParameter("about");

		System.out.println(name);
		System.out.println(company);
		System.out.println(phone);
		System.out.println(email);
		System.out.println(about);

		ContactEntity entity = new ContactEntity();
		entity.setName(name);
		entity.setEmail(email);
		entity.setPhone(phone);
		entity.setCompany(company);
		entity.setAbout(about);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();

		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		boolean valid = this.service.validateAndSave(entity);
		if (valid) {
			System.out.println("Data is valid");
			writer.println("Registration is successfull for user " + name);
		} else {
			System.out.println("Data is invalid");
			writer.println("Registration is failed");
		}
		writer.println("</h1>");
		writer.println("<h3>");
		writer.println("<a href='index.html'>Click here to add more details");
		writer.println("</h3>");

		writer.println("</body>");
		writer.println("</html>");

	}

}
