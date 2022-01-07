package com.pluzad.conn_finance.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pluzad.conn_finance.entities.Client;
import com.pluzad.conn_finance.entities.Order;
import com.pluzad.conn_finance.entities.User;
import com.pluzad.conn_finance.repositories.ClientRepository;
import com.pluzad.conn_finance.repositories.OrderRepository;
import com.pluzad.conn_finance.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Kiko", "kiko@kiko.com", "+5599999999", "123456");
		User u2 = new User(null, "Chaves", "chaves@chaves.com", "+5588888888", "123456");
		
		Client c1 = new Client(null, "Dona Florinda", "florinda@flores.com", "+5577777777", 
				"Rua das Flores", 55, "Bairro das Flores", "Flores City", 
				"Amo seu Girafales. Gosta de café", true, Instant.parse("2021-01-07T11:57:07Z"));
		Client c2 = new Client(null, "Xiquinha", "xiquinha@xica.com", "+5566666666", 
				"Rua das Xicas", 55, "Bairro das Xicas", "Xicas City", 
				"Chora demais", true, Instant.parse("2021-01-07T15:57:07Z"));
		
		Order o1 = new Order(null, Instant.parse("2021-01-07T12:57:07Z"), u2, c1);
		Order o2 = new Order(null, Instant.parse("2021-01-06T11:59:07Z"), u1, c2);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		clientRepository.saveAll(Arrays.asList(c1, c2));
		orderRepository.saveAll(Arrays.asList(o1, o2));
		
	}
	
	
	
}
