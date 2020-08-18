package com.prakash.spring.starterdemo.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.spring.starterdemo.product.model.Product;
import com.prakash.spring.starterdemo.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;

	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		
		return productService.getAllProducts();
	}
	

	@RequestMapping("/product/{id}")
	public Product getProductDetails(@PathVariable int id) {
		
		return productService.getProductDetail(id);
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public Product saveProductDetails(@RequestBody Product newProduct) {
		
		return productService.saveProductDetail(newProduct);
	}
}
