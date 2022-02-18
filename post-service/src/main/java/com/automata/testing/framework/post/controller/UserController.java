package com.automata.testing.framework.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automata.testing.framework.post.service.IUserService;

@RestController
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping(path = "/user/delete/{id}")
	public void deleteUser(@PathVariable(name = "identifier") Integer id) {
		userService.deleteById(id);
	}
}
