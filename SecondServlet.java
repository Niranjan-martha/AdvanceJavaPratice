package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//read form1 /req1 ata
		String name=req.getParameter("name");
		String addrs=req.getParameter("addrs");
		int age=Integer.parseInt(req.getParameter("age"));
		String ms=req.getParameter("ms");
		//read form2/request data
		String f2val1=req.getParameter("f2t1");
		String f2val2=req.getParameter("f2t2");
		//read form2/req2 data
		pw.println("<h1 style='color:red'>Form1/request1 data::"+name+"....."+addrs+"..."+age+"..."+ms+"</h1>");
		pw.println("<h1 style='color:blue'>Form2/request2 data::"+f2val1+"..."+f2val2+"</h1>");
		
		pw.println("<h2 ><a href='Person_Details.html'>Home::</a></h2>");
		//close stream
		pw.close();
	}		
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
