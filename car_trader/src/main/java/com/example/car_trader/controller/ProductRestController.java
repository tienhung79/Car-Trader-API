package com.example.car_trader.controller;


import com.example.car_trader.model.Product;
import com.example.car_trader.model.ProductType;
import com.example.car_trader.service.product.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/public")
public class ProductRestController {

    @Autowired
    private IProductTypeService iProductsService;



    @GetMapping("/type-product")
    public ResponseEntity<List<ProductType>> displayTypeMenu() {
        List<ProductType> productsType = iProductsService.getAllTypeProduct();
        return new ResponseEntity<>(productsType, HttpStatus.OK);
    }

    @GetMapping("/product-by-type/{type}")
    public ResponseEntity<List<Product>> displayProductByType(@PathVariable Integer type) {
        List<Product> products = iProductsService.getProductByTypeProducts(type);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/product-by-name")
    public ResponseEntity<List<Product>> displayProductByName(@RequestParam(name = "productName") String productName) {
        List<Product> products = iProductsService.getProductByNameProduct(productName);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}