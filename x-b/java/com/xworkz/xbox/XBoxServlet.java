package com.xworkz.xbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XBoxServlet extends HttpServlet{
	public XBoxServlet() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doPost(req, resp);
		String nameFromReq = req.getParameter("name");
		String gameTypeFromReq = req.getParameter("gameType");
		String seriesFromReq = req.getParameter("series");
		String cuponTypeFromReq = req.getParameter("cupon");
		String usernameTypeFromReq = req.getParameter("username");
		String emailTypeFromReq = req.getParameter("email");
		System.out.println(nameFromReq);
		System.out.println(gameTypeFromReq);
		System.out.println(seriesFromReq);
		System.out.println(cuponTypeFromReq);
		System.out.println(usernameTypeFromReq);
		System.out.println(emailTypeFromReq);
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1 style=color:blue;>");
		writer.println("<h1>");
		writer.println("<b>");
		writer.println("order is done");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
	}

}
