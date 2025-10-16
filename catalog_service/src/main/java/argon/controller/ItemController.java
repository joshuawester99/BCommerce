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

import argon.dto.CatalogDto;
import argon.dto.ItemDto;
import argon.dto.ReviewDto;
import argon.service.ItemService;

@RestController
@RequestMapping(value = "catalog")
public class ItemController {

	@Autowired private ItemService service;

	@GetMapping
	public ResponseEntity<Page<ItemDto>> listItems(Pageable pageable, @RequestParam Optional<String> q) {
		return null;

	}

	@GetMapping("/{itemId}")
	public ResponseEntity<ItemDto> getItem(@PathVariable Long itemId) {
		return null;

	}

	@PostMapping
	public ResponseEntity<ItemDto> createItem(@RequestBody ItemDto dto) {
		return null;

	}

	@PutMapping("/{itemId}")
	public ResponseEntity<ItemDto> updateItem(@PathVariable Long itemId, @RequestBody ItemDto dto) {
		return null;

	}

	@DeleteMapping("/{itemId}")
	public ResponseEntity<Void> deleteItem(@PathVariable Long itemId) {
		return null;

	}

	@GetMapping("/{itemId}/inventory")
	public ResponseEntity<CatalogDto> getInventory(@PathVariable Long itemId) {
		return null;

	}

	@PutMapping("/{itemId}/inventory")
	public ResponseEntity<CatalogDto> updateInventory(@PathVariable Long itemId, @RequestBody CatalogDto dto) {
		return null;

	}

	@GetMapping("/{itemId}/reviews")
	public ResponseEntity<Page<ReviewDto>> listReviews(@PathVariable Long itemId, Pageable pageable) {
		return null;

	}

	@PostMapping("/{itemId}/reviews")
	public ResponseEntity<ReviewDto> createReview(@PathVariable Long itemId, @RequestBody ReviewDto dto, Long userId) {
		return null;

	}

}
