package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class ShippingService {
	// Atributo
	//@Autowired
	private Order order;
	
	// Método Construtor
	public ShippingService() {
	//	this.order = order;
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
		}  else {
			//System.out.println("Erro! Valor inferior a 0");
		}
		return frete;
	}
}
