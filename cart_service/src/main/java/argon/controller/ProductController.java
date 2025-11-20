package argon.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import argon.model.OrderItem;

public class ProductController {

	@GetMapping("/orders")
	public ResponseEntity<Page<OrderItem>> listOrders(Long userId, Pageable pageable) {
		return null;
	}

	@GetMapping("/orders/{orderId}")
	public ResponseEntity<OrderItem> getOrder(Long userId, @PathVariable Long orderId) {
		return null;

	}

	@PostMapping("/orders/{orderId}/cancel")
	public ResponseEntity<OrderItem> cancelOrder(Long userId, @PathVariable Long orderId) {
		return null;

	}

	@PostMapping("/orders/{orderId}/items")
	public ResponseEntity<OrderItem> addOrderItem(Long userId, @PathVariable Long orderId, @RequestBody OrderItem dto) {
		return null;

	}

	@PutMapping("/orders/{orderId}/items/{itemId}")
	public ResponseEntity<OrderItem> updateOrderItem(Long userId, @PathVariable Long orderId, @PathVariable Long itemId, @RequestBody OrderItem dto) {
		return null;

	}

}
