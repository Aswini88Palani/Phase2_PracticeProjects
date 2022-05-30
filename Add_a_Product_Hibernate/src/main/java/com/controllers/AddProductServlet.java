package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.dto.Product;

public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddProductServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String brand = request.getParameter("brand");
		String madein = request.getParameter("madein");
		int price = Integer.parseInt(request.getParameter("price"));
		
		Product product = new Product(name, brand, madein, price);
		ProductDao dao = new ProductDaoImpl();
		Integer id = dao.addProduct(product);
		
		if(id!=null) {
			request.getRequestDispatcher("addProduct.jsp").include(request, response);
			out.println("<h2 style='color:red;'> Product ADDED successfully!</h2>");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
