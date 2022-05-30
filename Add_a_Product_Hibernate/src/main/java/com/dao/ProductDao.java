package com.dao;

import java.util.Set;

import com.dto.Product;

public interface ProductDao {
	public Integer addProduct(Product product);
	public void updateProduct(Integer id, int price);
	public void deleteProduct(Integer id);
	public Set <Product> getAllProducts();

}
