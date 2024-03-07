package com.springVthread.repository;

import com.springVthread.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>
{
}