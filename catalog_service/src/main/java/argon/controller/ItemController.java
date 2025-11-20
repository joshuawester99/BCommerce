package argon.controller;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import argon.model.Item;
import argon.model.Review;
import argon.service.ItemService;

@RestController
@RequestMapping(value = "catalog")
public class ItemController {

	@Autowired private ItemService service;

	@GetMapping
	public ResponseEntity<Page<Item>> listItems(Pageable pageable, @RequestParam Optional<String> q) {
		return null;

	}

	@GetMapping("/{itemId}")
	public ResponseEntity<Item> getItem(@PathVariable Long itemId) {
		return null;

	}

	@PostMapping
	public ResponseEntity<Item> createItem(@RequestBody Item dto) {
		return null;

	}

	@PutMapping("/{itemId}")
	public ResponseEntity<Item> updateItem(@PathVariable Long itemId, @RequestBody Item dto) {
		return null;

	}

	@DeleteMapping("/{itemId}")
	public ResponseEntity<Void> deleteItem(@PathVariable Long itemId) {
		return null;

	}

	@GetMapping("/{itemId}/reviews")
	public ResponseEntity<Page<Review>> listReviews(@PathVariable Long itemId, Pageable pageable) {
		return null;

	}

	@PostMapping("/{itemId}/reviews")
	public ResponseEntity<Review> createReview(@PathVariable Long itemId, @RequestBody Review dto, Long userId) {
		return null;

	}

}
