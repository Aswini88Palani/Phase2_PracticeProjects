package com.controllers;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ProductDaoImpl;
import com.dto.Product;


public class GetAllProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public GetAllProductsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Set<Product> allProducts = new ProductDaoImpl().getAllProducts();
		HttpSession session = request.getSession();
		if(allProducts.size() > 0) {
			session.setAttribute("products", allProducts);
		} else {
			session.setAttribute("msg", "No product data found!!");
		}
		
		response.sendRedirect("getAllProducts.jsp");		
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
