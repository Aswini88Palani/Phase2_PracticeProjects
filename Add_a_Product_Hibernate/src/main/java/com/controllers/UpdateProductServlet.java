package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;

public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateProductServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		ProductDao dao = new ProductDaoImpl();
		dao.updateProduct(id, price);
		
		request.getRequestDispatcher("updateProduct.jsp").include(request, response);
		out.println("<h2 style='color:red;'> Product UPDATED successfully!</h2>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
