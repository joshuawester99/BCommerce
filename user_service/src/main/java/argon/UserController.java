package argon;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setName("C. S. Lewis");
		user.setEmail("cslewis@narnia.com");
		user.setCredit_card("1234123412341243");
		user.setAddress("Narnia");
		users.add(user);
		return ResponseEntity.ok(users);
	}
	
	// log in
	
	// log out
	
	// create account
}
