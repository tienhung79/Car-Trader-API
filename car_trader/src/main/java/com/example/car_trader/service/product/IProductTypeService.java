package com.example.car_trader.service.product;



import com.example.car_trader.model.Product;
import com.example.car_trader.model.ProductType;

import java.util.List;

public interface IProductTypeService {

    List<ProductType> findAllType();
    List<ProductType> getAllTypeProduct();

    List<Product> getProductByTypeProducts(Integer type);

    List<Product> getProductByNameProduct(String productName);
}
