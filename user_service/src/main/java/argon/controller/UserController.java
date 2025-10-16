package argon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import argon.dto.AddressDto;
import argon.dto.UserDto;
import argon.service.UserService;

@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired UserService service;

	@PostMapping("/users/register")
	public ResponseEntity<UserDto> register(@RequestBody UserDto dto) {
		return null; 

	}

	@GetMapping("/users/self")
	public ResponseEntity<UserDto> getSelf(Long userId) {
		return null; 

	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<UserDto> getUser(@PathVariable Long userId) {
		return null; 

	}

	@PutMapping("/users/{userId}")
	public ResponseEntity<UserDto> updateUser(@PathVariable Long userId, @RequestBody AddressDto dto) {
		return null; 

	}

	@DeleteMapping("/users/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
		return null; 

	}
}
