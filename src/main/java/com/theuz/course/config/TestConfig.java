package com.theuz.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.theuz.course.entities.User;
import com.theuz.course.entities.Order;
import com.theuz.course.repositories.OrderRepository;
import com.theuz.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Matheus Henrique", "matheus@email.com", "77777777", "senha12345");
		User u2 = new User(null, "Davi Jose", "davi@email.com", "33333333", "senha54321"); 
		
		Order o1 = new Order(null, Instant.parse("2023-06-15T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2023-06-14T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2023-06-13T15:21:22Z"), u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}

}
