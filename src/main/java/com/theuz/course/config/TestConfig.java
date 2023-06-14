package com.theuz.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.theuz.course.entities.User;
import com.theuz.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Matheus Henrique", "matheus@email.com", "77777777", "senha12345");
		User u2 = new User(null, "Davi Jose", "davi@email.com", "33333333", "senha54321"); 

		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}