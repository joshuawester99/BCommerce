package argon.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import argon.model.Payment;
import argon.service.CartService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "api/cart")
@Slf4j
public class CartController {

	@Autowired private CartService service;
	
	@PostMapping("/checkout")
	@ResponseStatus(HttpStatus.CREATED)
	public String checkout(@RequestBody Payment payment) {
		service.checkout(payment);
		return "Checkout successfull!";
	}
	
    public CompletableFuture<String> fallbackMethod(Payment payment, RuntimeException runtimeException) {
        return CompletableFuture.supplyAsync(() -> "An error occured. Please try again later.");
    }


}
