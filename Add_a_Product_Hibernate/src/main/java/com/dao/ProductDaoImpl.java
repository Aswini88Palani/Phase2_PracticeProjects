package com.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dto.Product;
import com.util.HibernateUtil;

public class ProductDaoImpl implements ProductDao{
	private SessionFactory factory;
	
	public ProductDaoImpl() {
		factory = new HibernateUtil().getSessionFactory();
	}

	@Override
	public Integer addProduct(Product product) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Integer id = (Integer) session.save(product);
		
		txn.commit();
		session.close();
		return id;
	}

	@Override
	public void updateProduct(Integer id, int price) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Product product = session.get(Product.class, id);
		product.setPrice(price);
		
		session.update(product);
		
		txn.commit();
		session.close();
		
	}

	@Override
	public void deleteProduct(Integer id) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Product product = session.get(Product.class, id);
		session.delete(product);
		
		txn.commit();
		session.close();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set <Product> getAllProducts() {
		Set<Product> allProducts = null;
		
		String hql = "From Product";
		
		Session session = factory.openSession();
		TypedQuery<Product> typedQuery = session.createQuery(hql);
		allProducts =  new HashSet<Product>(typedQuery.getResultList());
		
		session.close();
		return allProducts;
	}
}
