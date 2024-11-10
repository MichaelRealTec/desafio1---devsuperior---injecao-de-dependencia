package com.devsuperior.desafio1.service;

import com.devsuperior.desafio1.entities.Order;

public class OrderService {
	// Atributo
	private Order order;
	
	// Método Construtor
	public OrderService(Order order) {
		this.order = order;
	}
	
	// Método
	public double total(Order order) {
		return order.getBasic() - order.getBasic() * (order.getDiscount() / 100);
	}
	
}
