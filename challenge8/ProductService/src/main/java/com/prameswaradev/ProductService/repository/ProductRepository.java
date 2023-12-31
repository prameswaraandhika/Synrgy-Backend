package com.prameswaradev.ProductService.repository;

import com.prameswaradev.ProductService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findAllByMerchantId(UUID id);
    List<Product> findAllByMerchantIdOrderByPriceDesc(UUID id);

}
