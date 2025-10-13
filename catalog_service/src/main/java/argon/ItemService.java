package argon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired ItemRepository repository;
	
	public Item getItem() {
		return null;
	}
}