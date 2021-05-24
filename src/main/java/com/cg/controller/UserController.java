package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.User;
import com.cg.entities.Admin;
import com.cg.entities.Parent;
//import com.cg.entities.Teacher;

import com.cg.exception.WrongCredentialsException;
import com.cg.service.IParentService;
import com.cg.service.IUserService;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService uService;

	@Autowired
	private IParentService bService;

	/**
	 * To inject new user details into repository.
	 * 
	 * @param user
	 * @return User
	 */
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/add")
	public User addNewUser(@RequestBody User user) {
		User rUser = uService.addNewUser(user);
		return rUser;
	}

	/**
	 * To inject new user having admin role into both user and admin repository.
	 * 
	 * @param admin
	 * @return User & Accountant
	 */
	/*@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/add/admin")
	public User addNewAdmin(@RequestBody Admin admin) {
		User rUser = uService.addNewAdmin(admin);
		return rUser;
	}*/

	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/add/parent")
	public User addNewParent(@RequestBody Parent parent,
			Integer id) {
		Parent rParent = bService.addParent(parent,id);
		User rUser = new User(rParent.getParentId(), rParent.getPassword(), "PARENT");
		return rUser;
	}

	/*@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/add/teacher")
	public User addNewTeacher(@RequestBody Teacher teacher) {
		Teacher rTeacher = bService.addTeacher(teacher);
		User rUser = new User(rTeacher.getUserId(), rTeacher.getPassword(), "TEACHER");
		return rUser;
	}*/

	
	@ResponseStatus(code = HttpStatus.OK)
	@PostMapping("/signin")
	public User signIn(@RequestBody User user) {
		User rUser = uService.signIn(user);
		if (!(rUser.getPassword().equals(user.getPassword()))) {
			throw new WrongCredentialsException("Wrong Password");
		}
		return rUser;
	}

	/**
	 * To request signout for an existing user. To fetch the details from
	 * repository.
	 * 
	 * @param user
	 * @return User
	 */
	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping("/signout")
	public User signOut(@RequestBody User user) {
		System.out.println("Request Data : " + user);
		User rUser = uService.signOut(user);
		return rUser;
	}
}