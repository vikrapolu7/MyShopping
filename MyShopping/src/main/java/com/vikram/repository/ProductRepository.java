package com.vikram.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.vikram.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>, CrudRepository<Product, String>{

	Product findByIdproduct(int i);

}
