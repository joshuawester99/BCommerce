package argon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import argon.model.Payment;

public class PaymentController {
	
	@PostMapping("/payments")
	public ResponseEntity<Payment> createPayment(Long userId, @RequestBody Payment dto) {
		return null;

	}

	@GetMapping("/payments/{paymentId}")
	public ResponseEntity<Payment> getPayment(Long userId, @PathVariable Long paymentId) {
		return null;

	}

	@PostMapping("/payments/{paymentId}/confirm")
	public ResponseEntity<Payment> confirmPayment(@PathVariable Long paymentId, @RequestBody Payment dto) {
		return null;

	}

}
