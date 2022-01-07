package com.pluzad.conn_finance.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluzad.conn_finance.entities.Client;
import com.pluzad.conn_finance.services.ClientServices;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {


	@Autowired
	private ClientServices services;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {		
		List<Client> list = services.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Client> findById(@PathVariable Long id){
		Client obj = services.findById(id);		
		return ResponseEntity.ok().body(obj);		
	}
	
	
	
}
