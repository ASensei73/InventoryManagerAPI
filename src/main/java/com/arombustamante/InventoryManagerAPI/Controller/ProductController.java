package com.arombustamante.InventoryManagerAPI.Controller;

import com.arombustamante.InventoryManagerAPI.Entity.Product;
import com.arombustamante.InventoryManagerAPI.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAll() {
        return productService.productList();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.productFindById(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.productSave(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.productDelete(id);
    }

}
