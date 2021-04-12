package com.xworkz.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookingWeb extends HttpServlet{

	public BookingWeb() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("invoked doGet method from Bus ticket Booking");
		System.out.println(req);
		String sourceFromReq = req.getParameter("source");
		System.out.println(sourceFromReq);
		String destiFromReq = req.getParameter("desti");
		System.out.println(destiFromReq);
		String nopFromReq = req.getParameter("nop");
		System.out.println(nopFromReq);
		String genderFromReq = req.getParameter("gender");
		System.out.println(genderFromReq);
		String bookedbyFromReq = req.getParameter("bookedby");
		System.out.println(bookedbyFromReq);
		String busvendorFromReq = req.getParameter("busvendor");
		System.out.println(busvendorFromReq);
		String emailFromReq = req.getParameter("email");
		System.out.println(emailFromReq);
		String phonenumFromReq = req.getParameter("phonenum");
		System.out.println(phonenumFromReq);
		String dateFromReq = req.getParameter("date");
		System.out.println(dateFromReq);
		String bustypeFromReq = req.getParameter("bustype");
		System.out.println(bustypeFromReq);
		
		
		resp.setContentType("Text/html");
		PrintWriter writter = resp.getWriter();
		writter.println("<html>");
		writter.println("<body>");
		writter.println("<h1>");
		writter.println("<b>");
		writter.println("Ticket Booking is Successful");
		writter.println("</b>");
		writter.println("</h1>");
		writter.println("<h4>");
		writter.println("Ticket Booking Details");
		writter.println("</h4>");
		writter.println("\n source: "+sourceFromReq);
		writter.println("<br>");
		writter.println("\n destination: "+destiFromReq);
		writter.println("<br>");
		writter.println("\n number of peoples: "+nopFromReq);
		writter.println("<br>");
		writter.println("\n gender: "+genderFromReq);
		writter.println("<br>");
		writter.println("\n bookedby: "+bookedbyFromReq);
		writter.println("<br>");
		writter.println("busvendor: "+busvendorFromReq);
		writter.println("<br>");
		writter.println("email: "+emailFromReq);
		writter.println("<br>");
		writter.println("phonenum: "+phonenumFromReq);
		writter.println("<br>");
		writter.println("date: "+dateFromReq);
		writter.println("<br>");
		writter.println("bustype: "+bustypeFromReq);
		writter.println("</body>");
		writter.println("</html>");
		writter.flush();

	}
}
