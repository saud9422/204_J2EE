package com.tka;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/empinfo")
public class Employee extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name =req.getParameter("name");
		String email =req.getParameter("email");
		String contact =req.getParameter("contactno");
		String dob =req.getParameter("dob");
		String position =req.getParameter("position");
		String department =req.getParameter("department");
		String salary =req.getParameter("salary");
		String join =req.getParameter("join");
		String address =req.getParameter("address");
		String city =req.getParameter("city");
		String state =req.getParameter("state");
		String password= req.getParameter("password");
		
		System.out.println(name+ " "+email+" "+contact+" "+dob+" "+position+" "+department+" "+salary+" "+join+" "+address+" "+city+" "+state+" "+password);
		
		PrintWriter out=resp.getWriter();
		out.println(name);
		out.println(email);
		out.println(contact);
		out.println(dob);
		out.println(position);
		out.println(department);
		out.println(salary);
		out.println(join);
		out.println(address);
		out.println(city);
		out.println(state);
		out.println(password);
		
		
	}
}
