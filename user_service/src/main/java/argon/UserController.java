package argon;

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
	public ResponseEntity<User> getUser() {
		return null;
	}
	
	// log in
	
	// log out
	
	// create account
}
