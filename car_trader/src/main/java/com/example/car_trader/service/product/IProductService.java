package com.example.car_trader.service.product;


import com.example.car_trader.dto.ProductDTO;
import com.example.car_trader.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {

//    Page<Product> findAllProduct( String name, Integer productTypeId,Pageable pageable);

    Page<Product> findAll(Pageable pageable);

    void addProduct(ProductDTO productDTO);

    Product findById(int id);

    List<Product> findNewProduct();

    List<Product> getProductByTypeProduct(Integer type);

    void updateQuantityProduct(Product product);
}
