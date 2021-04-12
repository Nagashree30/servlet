package com.xworkz.integration.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.integration.entity.ContactEntity;
import com.xworkz.integration.service.ContactService;
import com.xworkz.integration.service.ContactServiceImpl;

public class DisplayAllServlet extends HttpServlet {

	private ContactService service;

	public DisplayAllServlet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.service = new ContactServiceImpl();
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoke get from DisplayAllServlet ");

		List listFromService =(List) this.service.getAll();
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		if (listFromService != null && !listFromService.isEmpty()) {
			System.out.println("list is found with size " + listFromService.size());
			writer.println("<h1>Results found, Total :" + listFromService.size() + "</h1>");
			writer.println("<table border='1'>");
			Iterator<ContactEntity> iterator = listFromService.iterator();
			while (iterator.hasNext()) {
				ContactEntity ele = iterator.next();
				writer.println("<tr>");
				writer.println(" <td>" + ele.getName() + "</td>");
				writer.println(" <td>" + ele.getEmail() + "</td>");
				writer.println("</tr>");
			}
			writer.println("</table>");
		} else {
			System.out.println("list is empty");
			writer.println("<h1>Results not found</h1>");
			writer.println("</body>");
			writer.println("</html>");

		}

	}
}
