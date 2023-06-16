package com.ibm.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ibm.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    
	private List<Product> products;
	
	public ProductRepositoryImpl() {
		products=new ArrayList<Product>();
	}
     
    @Override
	public void persist(Product p) {
		// TODO Auto-generated method stub
    	products.add(p);
    }

	@Override
	public Product fetch(int code) {
		// TODO Auto-generated method stub
		return products.stream().filter(p -> p.getCode()==code).findFirst().get();
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
