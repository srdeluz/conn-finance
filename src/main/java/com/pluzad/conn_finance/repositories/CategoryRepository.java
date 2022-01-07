package com.pluzad.conn_finance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluzad.conn_finance.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
