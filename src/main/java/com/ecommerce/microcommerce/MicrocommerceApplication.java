package com.ecommerce.microcommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicrocommerceApplication {
// j'utilise le port 9090 configuré dans "application.properties"
	public static void main(String[] args) {
		SpringApplication.run(MicrocommerceApplication.class, args);
	}

}
