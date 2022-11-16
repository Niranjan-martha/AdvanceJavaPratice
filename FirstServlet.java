package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {
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
		
		//generate form2 dynamic based on the marital status
		if(ms.equalsIgnoreCase("married")) {
			pw.println("<h1 style='color:red;text-align:center'>Person Information Gathering-Form2</h1>");
			pw.println("<form action='secondurl' method='POST'>");
			pw.println("<table bgcolor='cyan' align:'center'>");
			pw.println("<tr><td>Spouse Name::</td><td><input type='text' name='f2t1'></td></tr>");
			pw.println("<tr><td>Number Of Kids::</td><td><input type='text' name='f2t2'></td></tr>");
			pw.println("<tr><td colspan='2'><input type='submit' value='Submit'></td></tr>");
			pw.println("</table>");
			pw.println("</form>");		
			}
		else {
			pw.println("<h1 style='color:red;text-align:center'>Person Information Gathering-Form2</h1>");
			pw.println("<form action='secondurl' method='POST'>");
			pw.println("<table bgcolor='cyan' align:'center'>");
			pw.println("<tr><td>When Do You Want TO Marry::</td><td><input type='text' name='f2t1'></td></tr>");
			pw.println("<tr><td>Why Do You Want To Marry::</td><td><input type='text' name='f2t2'></td></tr>");
			pw.println("<tr><td colspan='2'><input type='submit' value='Submit'></td></tr>");
			pw.println("</table>");
			pw.println("</form>");
		}
		//close stream
		pw.close();
	}		
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
