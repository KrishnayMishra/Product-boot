package com.ibm.repo;

import java.util.List;

import com.ibm.entity.Product;

public interface ProductRepository {
	
	void persist(Product p);
	
	Product fetch(int code);
	
	List<Product> list();
	

}
