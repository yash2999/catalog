package com.flipkart.data;

import com.flipkart.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategoryIgnoreCaseContainingOrderByCost(String category);
    List<Product> findByCategoryIgnoreCaseContaining(String category);

    List<Product> findByCategoryIgnoreCaseContainingOrderByCostDesc(String category);

    List<Product> findAllByOrderByCostAsc();

    List<Product> findAllByOrderByCostDesc();
}
