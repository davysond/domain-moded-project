package com.example.domain;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.domain.entities.Client;
import com.example.domain.entities.Order;
import com.example.domain.entities.OrderItem;
import com.example.domain.entities.OrderStatus;
import com.example.domain.entities.Product;
import com.example.domain.repositories.ClientRepository;
import com.example.domain.repositories.OrderItemRepository;
import com.example.domain.repositories.OrderRepository;
import com.example.domain.repositories.ProductRepository;

@SpringBootApplication
public class DomainApplication implements CommandLineRunner {
	
	/*
	 * O Autowired é utlizado para preenchimento automático da instância referida.
	*/
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DomainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client c1 = new Client(null, "davyson@admin.com", "Davyson Douglas");
		clientRepository.save(c1);
		
		Product p1 = new Product(null, "TV", 1000.0);
		Product p2 = new Product(null, "Mouse", 40.0);
		Product p3 = new Product(null, "PC", 1200.0);
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Order o1 = new Order(null, Instant.parse("2022-08-29T11:19:32Z"), OrderStatus.PAID, c1);
		Order o2 = new Order(null, Instant.parse("2022-08-29T11:25:51Z"), OrderStatus.WAITING, c1);
		orderRepository.saveAll(Arrays.asList(o1, o2));
		
		OrderItem oi1 = new OrderItem(null, 1, 1000.00, p1, o1);
		OrderItem oi2 = new OrderItem(null, 2, 40.0, p2, o1);
		OrderItem oi3 = new OrderItem(null, 1, 40.0, p2, o2);
		OrderItem oi4 = new OrderItem(null, 1, 1200.0, p3, o2);
		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));
	}

}
