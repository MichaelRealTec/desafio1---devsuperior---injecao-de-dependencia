package com.devsuperior.desafio1.service;

import com.devsuperior.desafio1.entities.Order;

public class ShippingService {
	// Atributo
	private Order order;
	
	// Método Construtor
	public ShippingService(Order order) {
		this.order = order;
	}
	
	// Método
	public double shipment(Order order) {
		Double frete = 0.0;
		if(order.getBasic() < 100.00) {
			frete = 20.00;
		} else if(order.getBasic() > 100 && order.getBasic() < 200.00) {
			frete = 12.00;
		} else if(order.getBasic() > 200) {
			frete = 0.0;
		} else {
			System.out.println("Erro! Valor inferior a 0");
		}
		return frete;
	}
}
