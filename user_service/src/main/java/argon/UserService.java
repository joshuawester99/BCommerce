package argon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired UserRepository repository;
	
	public List<User> getUsers() {
		return (List<User>) repository.findAll();
	}
	
	// log in
	
	// log out
	
	// create account
}
