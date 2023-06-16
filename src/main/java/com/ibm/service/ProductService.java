package com.ibm.service;

import java.util.List;

import com.ibm.entity.Product;

public interface ProductService {
	
	void save(Product p);
	
	Product find(int code);
	
	List<Product> findAll();
}
