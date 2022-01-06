package com.pluzad.conn_finance.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pluzad.conn_finance.entities.User;
import com.pluzad.conn_finance.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Kiko", "kiko@kiko.com", "+5599999999", "123456");
		User u2 = new User(null, "Chaves", "chaves@chaves.com", "+5588888888", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	
}
