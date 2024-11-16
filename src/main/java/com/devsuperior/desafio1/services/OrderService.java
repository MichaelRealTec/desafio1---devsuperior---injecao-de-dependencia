package com.devsuperior.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrderService {
	// Atributo
	//@Autowired
	//private Order order;
	@Autowired
	private ShippingService shippingService;
	
	// Método Construtor
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	// Método
	public double total(Order order) {
		if(order.getBasic() > 0) {
			return order.getBasic() - order.getBasic() * (order.getDiscount() / 100) + shippingService.shipment(order);
		}
		return order.getBasic() - order.getBasic() * (order.getDiscount() / 100);
	}
	
}
