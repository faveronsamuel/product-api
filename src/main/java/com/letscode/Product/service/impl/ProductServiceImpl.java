package com.letscode.Product.service.impl;

import com.letscode.Product.DTO.ProductRequest;
import com.letscode.Product.DTO.ProductResponse;
import com.letscode.Product.model.Product;
import com.letscode.Product.repository.ProductRepository;
import com.letscode.Product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductResponse registerProduct(ProductRequest productRequest) {
        Product product = new Product(productRequest);
        Product savedProduct = productRepository.save(product);
        return new ProductResponse(savedProduct);
    }

    @Override
    public List<ProductResponse> findAllProducts() {
        return null;
    }

    @Override
    public ProductResponse findProductByUuid(String uuid) {
        return null;
    }

    @Override
    public void deleteProductByUuid(String uuid) {

    }
}