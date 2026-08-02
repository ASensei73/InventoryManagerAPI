package com.arombustamante.InventoryManagerAPI.Service;

import com.arombustamante.InventoryManagerAPI.Entity.Product;
import com.arombustamante.InventoryManagerAPI.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> productList() {
        return productRepository.findAll();
    }

    @Override
    public Product productSave(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product productUpdate(Long id, Product product) {
        Product productExist = productRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Don´t exist product with id: " + id)
        );

        productExist.setId(product.getId());
        productExist.setName(product.getName());
        productExist.setCategory(product.getCategory());
        productExist.setStock(product.getStock());
        productExist.setPrice(product.getPrice());

        return productRepository.save(productExist);

    }

    @Override
    public void productDelete(Long id) {
        Product productExist = productRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Don´t exist product with id: " + id)
        );

        productRepository.delete(productExist);
    }

    @Override
    public Product productFindById(Long id) {
        return productRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Don´t exist product with id: " + id)
        );
    }
}
