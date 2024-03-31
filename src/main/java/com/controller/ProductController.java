package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
//	insert into product values(101,"laptop",50000,1);

//http://localhost:8080/product/findAll
	@Autowired
	ProductService productService;
	
	@GetMapping(value = "/findAll")
	public List<Product> findAll() {
		return productService.listOfProducts();
	}
	
	@PostMapping(value = "store")
	public String storeProduct(@RequestBody Product product) {
		return productService.storeProduct(product);
	}
}
