package com.example.car_trader.service.product.impl;


import com.example.car_trader.dto.ProductDTO;
import com.example.car_trader.model.Product;
import com.example.car_trader.repository.IProductRepository;
import com.example.car_trader.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService implements IProductService {


    @Autowired
    private IProductRepository productRepository;


//    @Override
//    public Page<Product> findAllProduct( String name, Integer productTypeId,Pageable pageable) {
//        return productRepository.findProductByProductNameAndAndProductTypeContaining(name, productTypeId, pageable);
//    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public void addProduct(ProductDTO productDTO) {

    }


    @Override
    public Product findById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> findNewProduct() {
        return productRepository.findNewProduct();
    }

    @Override
    public List<Product> getProductByTypeProduct(Integer type) {
        return productRepository.getProductByType(type);
    }

    @Override
    public void updateQuantityProduct(Product product) {
        productRepository.save(product);
    }
}
