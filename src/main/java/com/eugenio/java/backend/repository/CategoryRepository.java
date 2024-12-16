package com.eugenio.java.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eugenio.java.backend.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
