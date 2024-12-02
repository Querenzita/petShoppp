package com.pet.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Product;

public interface PetRepository extends JpaRepository<Product, Long> {

}