package com.iotbox.appCRM.jwtauth.conttroller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestAPIs {
	
	
	@GetMapping("/api/test/technicien")
	@PreAuthorize("hasRole('TECHNICIEN') or hasRole('ADMIN')")
	public String userAccess() {
		return ">>>Espace technicien!";
	}

	@GetMapping("/api/test/responsable")
	@PreAuthorize("hasRole('RESPONSABLE') or hasRole('ADMIN')")
	public String projectManagementAccess() {
		return ">>> Espace responsable!";
	}
	
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return ">>> espace admin!";
	}

}
