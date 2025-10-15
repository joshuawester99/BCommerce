package argon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import argon.model.Item;
import argon.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired ItemRepository repository;
	
	public Item getItem() {
		return null;
	}
}