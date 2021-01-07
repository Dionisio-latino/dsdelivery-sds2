package com.devsuperior.dsdelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdelivery.entities.Products;

public interface ProductRepository extends JpaRepository<Products, Long>{
	
	List<Products> findAllByOrderByNameAsc();
}
