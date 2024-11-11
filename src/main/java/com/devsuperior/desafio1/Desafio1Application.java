package com.devsuperior.desafio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.desafio1.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class Desafio1Application implements CommandLineRunner { // Apresentar mensagem no terminal   (implements CommandLineRunner)
	
	private OrderService orderService;
	
	public Desafio1Application(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Desafio 1 - DevSuperior - injeção de dependencia
		System.out.println("Teste");
		
	}

}

// Apresentar mensagem no terminal   (implements CommandLineRunner)
// acrescentar o component ou service na classe 
// Declarar a injeção de dependencia na classe principal