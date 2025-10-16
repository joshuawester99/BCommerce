package argon.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import argon.dto.AddressDto;

public class AddressController {
	
	@GetMapping("/users/{userId}/addresses")
	public ResponseEntity<List<AddressDto>> listAddresses(@PathVariable Long userId) {
		return null; 

	}

	@GetMapping("/addresses/{addressId}")
	public ResponseEntity<AddressDto> getAddress(@PathVariable Long addressId) {
		return null; 

	}

	@PostMapping("/users/{userId}/addresses")
	public ResponseEntity<AddressDto> addAddress(@PathVariable Long userId, @RequestBody AddressDto dto) {
		return null; 

	}

	@PutMapping("/users/{userId}/addresses/{addressId}")
	public ResponseEntity<AddressDto> updateAddress(@PathVariable Long userId, @PathVariable Long addressId, @RequestBody AddressDto dto) {
		return null; 

	}

	@DeleteMapping("/users/{userId}/addresses/{addressId}")
	public ResponseEntity<Void> deleteAddress(@PathVariable Long userId, @PathVariable Long addressId) {
		return null; 

	}

}
