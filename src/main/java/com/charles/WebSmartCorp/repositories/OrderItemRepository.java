package com.charles.WebSmartCorp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charles.WebSmartCorp.entities.Order;
import com.charles.WebSmartCorp.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
