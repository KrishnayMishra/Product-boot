package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Product;
import com.ibm.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void save(Product p) {
		// TODO Auto-generated method stub
		repo.persist(p);

	}

	@Override
	public Product find(int code) {
		// TODO Auto-generated method stub
		return repo.fetch(code);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return repo.list();
	}

}
