package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ValidateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ValidateUserServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Fetch value from request
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				boolean isUserValid=false;
				
				//2. Analyze the data or value
				if(username.equals("admin") && password.equals("admin123")) {
					isUserValid=true;
				}
				
				//3. Specify the servlet that is responsible for sending the response
				if(isUserValid==true) {
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("validuser.jsp");
					requestDispatcher.forward(request, response);
				}else {
					response.sendRedirect("InvalidUserServlet");
				}
				
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
