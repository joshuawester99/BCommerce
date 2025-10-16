package argon.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import argon.dto.CartDto;
import argon.dto.OrderItemDto;
import argon.dto.PaymentDto;
import argon.service.CartService;

@RestController
@RequestMapping(value = "cart")
public class CartController {

	@Autowired private CartService service;

	@GetMapping("/cart")
	public ResponseEntity<CartDto> getCart(Long userId) {
		return null;

	}

	@PostMapping("/cart/items")
	public ResponseEntity<CartDto> addCartItem(Long userId, @RequestBody OrderItemDto dto) {
		return null;

	}

	@PutMapping("/cart/items/{itemId}")
	public ResponseEntity<CartDto> updateCartItem(Long userId, @PathVariable Long itemId, @RequestBody OrderItemDto dto) {
		return null;

	}

	@DeleteMapping("/cart/items/{itemId}")
	public ResponseEntity<CartDto> removeCartItem(Long userId, @PathVariable Long itemId) {
		return null;

	}

	@DeleteMapping("/cart")
	public ResponseEntity<Void> emptyCart(Long userId) {
		return null;

	}

	@PostMapping("/cart/checkout")
	public ResponseEntity<CartDto> checkout(Long userId, @RequestBody PaymentDto dto) {
		return null;

	}


}
