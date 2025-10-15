package argon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import argon.model.Item;
import argon.service.ItemService;

@RestController
@RequestMapping(value = "catalog")
public class ItemController {

	@Autowired private ItemService service;
	
	@GetMapping
	public ResponseEntity<Item> getItem() {
		return null;
	}
}
