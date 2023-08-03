package com.example.car_trader.service.product.impl;


import com.example.car_trader.model.Product;
import com.example.car_trader.model.ProductType;
import com.example.car_trader.repository.IProductTypeRepository;
import com.example.car_trader.service.product.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService implements IProductTypeService {

    @Autowired
    private IProductTypeRepository iProductTypeRepository;

    @Override
    public List<ProductType> findAllType() {
        return iProductTypeRepository.findAll();
    }

    @Override
    public List<ProductType> getAllTypeProduct() {
        return iProductTypeRepository.findAll();
    }

    @Override
    public List<Product> getProductByTypeProducts(Integer type) {
        return iProductTypeRepository.getProductByType(type);
    }

    @Override
    public List<Product> getProductByNameProduct(String productName) {
        return iProductTypeRepository.getProductByName(productName);
    }
}
