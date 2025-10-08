package argon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	@Autowired CartRepository repository;
	
	public Cart getCart() {
		return null;
	}
	
	// add to cart
	
	// remove from cart
	
	// clear cart
	
	// check out
}
