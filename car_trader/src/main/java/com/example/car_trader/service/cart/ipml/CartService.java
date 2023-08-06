package com.example.car_trader.service.cart.ipml;

import com.example.car_trader.model.Cart;
import com.example.car_trader.repository.ICartRepository;
import com.example.car_trader.service.cart.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService {
    @Autowired
    private ICartRepository cartRepository;

    @Override
    public void createCart(Cart cart) {
        cartRepository.save(cart);
    }
}
