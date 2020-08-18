package com.prakash.spring.starterdemo.product.dao;

import org.springframework.data.repository.CrudRepository;

import com.prakash.spring.starterdemo.product.model.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {

}
