package com.xworkz.web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class GovernmentServlet extends HttpServlet
{

	private String stateName;
	private String partyName;
	
	public GovernmentServlet() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
@Override
public void init(ServletConfig config) throws ServletException {

	System.out.println("init in Government servlet");
	
	String servletNameFromXML=config.getServletName();
	System.out.println(servletNameFromXML);
	System.out.println(stateName);
	String stateName=config.getInitParameter("stateName");
	this.stateName=stateName;
	System.out.println(stateName);
	String partyName=config.getInitParameter("partyName");
	this.partyName=partyName;
    System.out.println(partyName);		
}
	
}
