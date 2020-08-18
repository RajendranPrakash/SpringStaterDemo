package com.prakash.spring.starterdemo.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakash.spring.starterdemo.product.dao.ProductRepo;
import com.prakash.spring.starterdemo.product.model.Product;

@Service
public class ProductService {
	
	//List<Product> products = null;
	@Autowired
	ProductRepo productRepo;

	public ProductService() {
				
		 /*this.products = new ArrayList<Product>(); 
		 products.add(new Product(1, "product1", 50)); 
		 products.add(new Product(2, "product2", 50));*/
		 
	}

	public List<Product> getAllProducts() {

		//return products;
		List<Product> products = new ArrayList<Product>();
		//Optional<T>.ofNullable(
		productRepo.findAll().forEach(product -> products.add(product));
		return products;
	}

	public Product getProductDetail(int id) {

		//return products.stream().filter(product -> (product.getProductId() == id)).findAny().orElse(null);
		return productRepo.findById(id).get();
	}

	public Product saveProductDetail(Product newProduct) {
		
		return productRepo.save(newProduct);
	}
	
}
