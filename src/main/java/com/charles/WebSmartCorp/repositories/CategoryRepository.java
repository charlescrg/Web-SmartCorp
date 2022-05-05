package com.charles.WebSmartCorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.charles.WebSmartCorp.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
