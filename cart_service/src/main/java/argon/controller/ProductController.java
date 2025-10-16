package argon.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import argon.dto.OrderItemDto;

public class ProductController {

	@GetMapping("/orders")
	public ResponseEntity<Page<OrderItemDto>> listOrders(Long userId, Pageable pageable) {
		return null;

	}

	@GetMapping("/orders/{orderId}")
	public ResponseEntity<OrderItemDto> getOrder(Long userId, @PathVariable Long orderId) {
		return null;

	}

	@PostMapping("/orders/{orderId}/cancel")
	public ResponseEntity<OrderItemDto> cancelOrder(Long userId, @PathVariable Long orderId) {
		return null;

	}

	@PostMapping("/orders/{orderId}/items")
	public ResponseEntity<OrderItemDto> addOrderItem(Long userId, @PathVariable Long orderId, @RequestBody OrderItemDto dto) {
		return null;

	}

	@PutMapping("/orders/{orderId}/items/{itemId}")
	public ResponseEntity<OrderItemDto> updateOrderItem(Long userId, @PathVariable Long orderId, @PathVariable Long itemId, @RequestBody OrderItemDto dto) {
		return null;

	}

}
