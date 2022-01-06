package com.pluzad.conn_finance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluzad.conn_finance.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
