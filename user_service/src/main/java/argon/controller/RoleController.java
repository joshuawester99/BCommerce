package argon.controller;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import argon.dto.RoleDto;

public class RoleController {

	@GetMapping("/roles")
	public ResponseEntity<Page<RoleDto>> listRoles(Pageable pageable) {
		return null;

	}

	@PostMapping("/roles")
	public ResponseEntity<RoleDto> createRole(@RequestBody RoleDto dto) {
		return null; 

	}

	@PutMapping("/roles/{roleId}")
	public ResponseEntity<RoleDto> updateRole(@PathVariable Long roleId, @RequestBody RoleDto dto) {
		return null;

	}

	@DeleteMapping("/roles/{roleId}")
	public ResponseEntity<Void> deleteRole(@PathVariable Long roleId) {
		return null; 

	}
}
