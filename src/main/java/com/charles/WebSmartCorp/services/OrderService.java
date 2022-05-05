package com.charles.WebSmartCorp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charles.WebSmartCorp.entities.Order;
import com.charles.WebSmartCorp.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findByID(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
