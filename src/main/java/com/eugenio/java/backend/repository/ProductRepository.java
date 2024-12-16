package com.eugenio.java.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eugenio.java.backend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	//
	@Query(value = "Select p.nome, p.preco, p.productidentifier, p.descricao "
			     + "from product p join category c on p.categoryid = c.id    "
			     + "where c.id = :categoryid ")
	public List<Product> getProductByCategory(@Param("categoryid") long categoryId);
	
	public Product findByProductIdentifier(String productIdentifier);

}
