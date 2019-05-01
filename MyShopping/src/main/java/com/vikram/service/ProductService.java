package com.vikram.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.vikram.model.Product;
import com.vikram.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}
	
	public void insertImage(Product product) {
		productRepository.save(product);
	}

	public Product findById(int i) {
		// TODO Auto-generated method stub
		
		
		return productRepository.findByIdproduct(i);
	}
}
