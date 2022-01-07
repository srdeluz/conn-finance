package com.pluzad.conn_finance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluzad.conn_finance.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
	

}
