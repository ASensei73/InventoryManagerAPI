package com.arombustamante.InventoryManagerAPI.Repository;

import com.arombustamante.InventoryManagerAPI.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
