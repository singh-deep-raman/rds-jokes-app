package com.raman.jokes.chucknorre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans-config.xml") // it tells Spring to load beans from this file too
public class ChuckNorreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorreApplication.class, args);
	}

}
