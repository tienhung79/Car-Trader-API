package com.example.car_trader.controller;


import com.example.car_trader.dto.BillRequestDTO;
import com.example.car_trader.dto.ProductDTO;
import com.example.car_trader.model.Bill;
import com.example.car_trader.model.Cart;
import com.example.car_trader.model.Customer;
import com.example.car_trader.model.Product;
import com.example.car_trader.service.bill.IBillService;
import com.example.car_trader.service.cart.ICartService;
import com.example.car_trader.service.customer.ICustomerService;
import com.example.car_trader.service.product.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/public/product")
public class ProductController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private IBillService billService;

    @Autowired
    private IProductService productService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICartService cartService;


    @GetMapping("/newProduct")
    public ResponseEntity<List<Product>> getNewProduct() {
        List<Product> newProductList = productService.findNewProduct();
        if (newProductList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(newProductList, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<Page<Product>> getAllProduct(@PageableDefault(size = 8) Pageable pageable,
                                                       @RequestParam(value = "page", defaultValue = "0")
                                                       int page) {
        pageable = PageRequest.of(page, 8);
        Page<Product> product = productService.findAll(pageable);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public ResponseEntity<?> createProduct(@Validated @RequestBody ProductDTO productDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        productService.addProduct(productDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/detail/{id}")
    public ResponseEntity<?> findProductById(@PathVariable("id") Integer id) {
        Product product = productService.findById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }


    @GetMapping("/productByType/{type}")
    public ResponseEntity<List<Product>> displayProductByType(@PathVariable Integer type) {
        List<Product> products = productService.getProductByTypeProduct(type);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("/add-to-bill")
    public ResponseEntity<BillRequestDTO> addToBill(@RequestBody BillRequestDTO billRequestDTO) {
        String username = billRequestDTO.getUsername();
        Customer customer = customerService.findByAccount(username);

        List<ProductDTO> listProductMenuDto = billRequestDTO.getproducts();
        LocalDate localDate = LocalDate.now();
        Integer total = 0;
        for (ProductDTO empty : listProductMenuDto
        ) {
            total = total + (empty.getPrice() * empty.getQuantityOfProduct());
        }
        billService.createBill(new Bill(localDate, false, total));
        Bill bill = billService.getBillNew();

        for (int i = 0; i < listProductMenuDto.size(); i++) {
            ProductDTO productMenuDto = listProductMenuDto.get(i);
            Product product = productService.findById(productMenuDto.getProductId());
            product.setquantity(product.getquantity() - productMenuDto.getQuantityOfProduct());
            productService.updateQuantityProduct(product);
            cartService.createCart(new Cart(productMenuDto.getQuantityOfProduct(), customer, product, bill));
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> findByProductName(@RequestParam(required = false, defaultValue = "") String nameSearch) {
        List<Product> productList = productService.findByName(nameSearch);
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/billHistory")
    public ResponseEntity<List<Bill>> getBillHistory(@RequestBody String username) {
        Customer customer = iCustomerService.findByAccount(username);
        System.out.println(customer.getCustomerName());
        List<Bill> bills = billService.getBillHistory(customer.getCustomerId());
        if (bills.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(bills, HttpStatus.OK);
    }
}
