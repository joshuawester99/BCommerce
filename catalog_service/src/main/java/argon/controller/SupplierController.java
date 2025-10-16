package argon.controller;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import argon.dto.SupplierDto;

public class SupplierController {
	
	@GetMapping("/suppliers")
	public ResponseEntity<Page<SupplierDto>> listSuppliers(Pageable pageable) {
		return null;

	}

	@GetMapping("/suppliers/{supplierId}")
	public ResponseEntity<SupplierDto> getSupplier(@PathVariable Long supplierId) {
		return null;

	}

	@PostMapping("/suppliers")
	public ResponseEntity<SupplierDto> createSupplier(@RequestBody SupplierDto dto) {
		return null;

	}

	@PutMapping("/suppliers/{supplierId}")
	public ResponseEntity<SupplierDto> updateSupplier(@PathVariable Long supplierId, @RequestBody SupplierDto dto) {
		return null;

	}

	@DeleteMapping("/suppliers/{supplierId}")
	public ResponseEntity<Void> deleteSupplier(@PathVariable Long supplierId) {
		return null;

	}
}
