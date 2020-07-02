package com.educandoweb.course.resources;

import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/users")


public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User (1L, "Joao", "joao@gmail.com", "99999", "12345") ;
		return ResponseEntity.ok().body(u);
	}




}
