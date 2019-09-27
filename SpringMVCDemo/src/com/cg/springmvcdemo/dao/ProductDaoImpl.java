package com.cg.springmvcdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;

@Repository("productrepo")
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	EntityManager manager;
	@Override
	public Product saveProduct(Product pro) {
		manager.persist(pro);
		return pro;
	}

	@Override
	public List<Product> findAllProduct() {
		Query query = manager.createQuery("From Product");
		List<Product> myList = query.getResultList();
		return myList;
	}

	@Override
	public Product findByProductId(int productId) {
		Product product = manager.find(Product.class, productId);
		return product;
	}

	@Override
	public int removeProduct(int productId) {
		Product pro = manager.find(Product.class,productId);
		if(pro!=null)
			manager.remove(pro);
		return 0;
	}

	@Override
	public Product updateProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
