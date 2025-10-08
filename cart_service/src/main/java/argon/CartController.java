package argon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "cart")
public class CartController {

	@Autowired private CartService service;
	
	@GetMapping
	public ResponseEntity<Cart> getCart() {
		return null;
	}
	
	// add to cart
	
	// remove from cart
	
	// clear cart
	
	// check out
}
