package argon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import argon.model.User;
import argon.service.UserService;

@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		List<User> users = service.getUsers();
		return ResponseEntity.ok(users);
	}
	
	// log in
	
	// log out
	
	// create account
}
