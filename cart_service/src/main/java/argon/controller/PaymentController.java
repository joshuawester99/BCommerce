package argon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import argon.dto.PaymentDto;

public class PaymentController {
	
	@PostMapping("/payments")
	public ResponseEntity<PaymentDto> createPayment(Long userId, @RequestBody PaymentDto dto) {
		return null;

	}

	@GetMapping("/payments/{paymentId}")
	public ResponseEntity<PaymentDto> getPayment(Long userId, @PathVariable Long paymentId) {
		return null;

	}

	@PostMapping("/payments/{paymentId}/confirm")
	public ResponseEntity<PaymentDto> confirmPayment(@PathVariable Long paymentId, @RequestBody PaymentDto dto) {
		return null;

	}

}
