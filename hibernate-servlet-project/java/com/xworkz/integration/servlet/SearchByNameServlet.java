package com.xworkz.integration.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.integration.entity.ContactEntity;
import com.xworkz.integration.service.ContactService;
import com.xworkz.integration.service.ContactServiceImpl;

public class SearchByNameServlet extends HttpServlet {

	private ContactService<ContactEntity> service;
	public SearchByNameServlet() {
		System.out.println("created "+this.getClass().getSimpleName());
	}	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
    System.out.println("invoke init method from SearchByNameServlet ");
    this.service = new ContactServiceImpl();
		super.init(config);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoked post method in SearchByNameServlet");

		String name = req.getParameter("name");
		System.out.println(name);
		ContactEntity entity=this.service.validateAndSearchByName(name);
		System.out.println(entity);
		
        resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Search by name</h1>");
		writer.println("<form action=\"search\" method=\"post\">\r\n"
				+ "<input type=\"text\" name=\"name\">\r\n"
				+ "<input type=\"submit\" value=\"Search\">\r\n"
				+ "\r\n"
				+ "</form>");
		if(entity!=null) {
		writer.println("<p>Search results found</br>"+entity.getName()+ "</p>");
		}else {
			writer.println("<p style='color:red;'>No results found</p>");	
		}
		writer.println("</body>");
		writer.println("</html>");
	
	}
}
