package com.example.car_trader.controller;


import com.example.car_trader.model.ProductType;
import com.example.car_trader.service.product.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/public/product")
public class ProductTypeController {

    @Autowired
    private IProductTypeService iProductTypeService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/type")
    public List<ProductType> findAllProductType(){
        return iProductTypeService.findAllType();
    }

}

