package argon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "catalog")
public class ItemController {

	@Autowired private ItemService service;
	
	@GetMapping
	public ResponseEntity<Item> getItem() {
		return null;
	}
}
