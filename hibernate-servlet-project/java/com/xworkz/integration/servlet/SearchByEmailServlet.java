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

public class SearchByEmailServlet extends HttpServlet {
	
	private ContactService<ContactEntity> service;
	
	public SearchByEmailServlet() {
		System.out.println("invoke SearchByEmailServlet");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("invoke init method  from SearchByEmailServlet");
		this.service=new ContactServiceImpl();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("invoked doPost method");
		String email=req.getParameter("email");
		System.out.println(email);
		
		ContactEntity entity=this.service.validateAndSearchByEmail(email);
		System.out.println(entity);
		
		resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Search by email</h1>");
		writer.println("<form action=\"searchByEmail\" method=\"post\">\r\n"
				+ "		<input type=\"email\" name=\"email\">\r\n"
				+ "		 <input type=\"submit\" value=\"Search\">\r\n"
				+ "	</form>");
		if(entity!=null) {
		writer.println("<p>Search results found</br>"+entity.getName()+"<br>"+entity.getEmail()+ "</p>");
		}else {
			writer.println("<p style='color:red;'>No results found</p>");	
		}
		writer.println("</body>");
		writer.println("</html>");
	
	}
}
