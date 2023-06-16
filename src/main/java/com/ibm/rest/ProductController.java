package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Product;
import com.ibm.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(value="/add" , consumes="application/json")
	public String add(@RequestBody Product p)
	{
		service.save(p);
		return "Product added";
	}
	
	@GetMapping(value="/get/{code}", produces="application/json")
	public Product get(@PathVariable int code)
	{
		return service.find(code);
	}
	
	@GetMapping(value="/list" , produces ="application/json")
	public List<Product> list(){
		return service.findAll();
	}

}
