package com.charles.WebSmartCorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.charles.WebSmartCorp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
