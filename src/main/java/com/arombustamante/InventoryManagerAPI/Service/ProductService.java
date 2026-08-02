package com.arombustamante.InventoryManagerAPI.Service;

import com.arombustamante.InventoryManagerAPI.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> productList();

    Product productSave(Product product);

    Product productUpdate(Long id, Product product);

    void productDelete(Long id);

    Product productFindById(Long id);

}
