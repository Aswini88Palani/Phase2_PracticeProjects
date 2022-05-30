package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ProductServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		int number = Integer.parseInt(request.getParameter("number"));
		String manufacturer = request.getParameter("manufacturer");
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("price", price);
		session.setAttribute("number", number);
		session.setAttribute("manufacturer", manufacturer);
		
		PrintWriter writer = response.getWriter();
		request.getRequestDispatcher("dashboard.jsp").include(request, response);
		writer.println("<h2 style='color:red;'>Product Added Successfully</h2>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
