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

import argon.model.Supplier;

public class SupplierController {
	
	@GetMapping("/suppliers")
	public ResponseEntity<Page<Supplier>> listSuppliers(Pageable pageable) {
		return null;

	}

	@GetMapping("/suppliers/{supplierId}")
	public ResponseEntity<Supplier> getSupplier(@PathVariable Long supplierId) {
		return null;

	}

	@PostMapping("/suppliers")
	public ResponseEntity<Supplier> createSupplier(@RequestBody Supplier dto) {
		return null;

	}

	@PutMapping("/suppliers/{supplierId}")
	public ResponseEntity<Supplier> updateSupplier(@PathVariable Long supplierId, @RequestBody Supplier dto) {
		return null;

	}

	@DeleteMapping("/suppliers/{supplierId}")
	public ResponseEntity<Void> deleteSupplier(@PathVariable Long supplierId) {
		return null;

	}
}
