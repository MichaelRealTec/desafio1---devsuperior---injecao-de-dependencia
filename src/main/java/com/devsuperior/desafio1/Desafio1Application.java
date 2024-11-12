package com.devsuperior.desafio1;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;
import com.devsuperior.desafio1.services.ShippingService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class Desafio1Application implements CommandLineRunner { // Apresentar mensagem no terminal   (implements CommandLineRunner)
	
	
	private OrderService orderService;
	private Order order;
	private ShippingService shippingService;
	
	public Desafio1Application(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Desafio 1 - DevSuperior - injeção de dependencia
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto)");
		Integer code = sc.nextInt();
		Double basic = sc.nextDouble();
		Double discount = sc.nextDouble();
		
		order = new Order(code, basic, discount);
		shippingService = new ShippingService();
		orderService = new OrderService(shippingService);
		//OrderService orderService = new OrderService("")
		//Desafio1Application desafio1Application = new Desafio1Application(Order order);
		
		//Double frete = order.getBasic();
		 
		System.out.println("Pedido código " + order.getCode());
		//double frete2 = orderService.total(order) + shippingService.shipment(order);
		System.out.printf("Valor total: R$ %.2f", (orderService.total(order) + shippingService.shipment(order)));
		//System.out.println("valor do frete = R$ " + shippingService.shipment(order));
		
		sc.close();
		
	}

}

// Apresentar mensagem no terminal   (implements CommandLineRunner)
// acrescentar o component ou service na classe 
// Declarar a injeção de dependencia na classe principal