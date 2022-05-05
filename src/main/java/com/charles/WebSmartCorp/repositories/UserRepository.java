package com.charles.WebSmartCorp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.charles.WebSmartCorp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {



}
