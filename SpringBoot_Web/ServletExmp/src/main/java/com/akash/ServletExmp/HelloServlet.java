package com.akash.ServletExmp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("in service...");
//		res.getWriter().println("hello world");	
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h2><i>hello world</i></h2>");
	}
}
