package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.ClassId;
import com.cg.entities.Parent;
import com.cg.entities.Student;
import com.cg.service.IParentService;
import com.cg.service.ParentService;
import com.cg.util.ParentUtil;

@RestController
@RequestMapping("/parent")
@Validated
public class ParentController {

	@Autowired
	//private ParentService parentService; // use interface
	private IParentService parentService;
	@Autowired
	private ParentUtil parentUtil;


	//@RequestMapping(method = RequestMethod.POST, value = "/parents")
	@PostMapping(value = "/add/{studid}")
	public Parent addParent(@RequestBody Parent parent, @PathVariable("studid") Integer id) {
		System.out.println("--------" + parent + "******" + id);
		return parentService.addParent(parent, id);

	}
	
	@GetMapping("/by/id/{id}")
	public Parent retrieveParentById(@PathVariable("id") Integer id) {
		return parentService.retrieveParentById(id);
	}

//	@GetMapping("/parents/{classId}")
//	public List<Parent> retrieveParentListByClass(@PathVariable("classId") ClassId classId) {
//		return parentService.retrieveParentListByClass(classId);
//	}
//
//	// @RequestMapping(method = RequestMethod.PUT, value = "/parents/{Id}")
//	@PutMapping(value = "/update")
//	public Parent updateParent(@RequestBody Parent parent)// , @PathVariable int id)
//	{
//		return parentService.updateParent(parent);
//	}
//
//	@GetMapping("/by/student/{student}")
//	public Parent retrieveParentByStudent(@PathVariable("student") Student student) {
//		// Parent parent = parentService.retrieveParentByStudent(student);
//		return parentService.retrieveParentByStudent(student);
//
//	}
//
//	@GetMapping("/by/id/{id}")
//	public Parent retrieveParentById(@PathVariable("id") Integer id) {
//		return parentService.retrieveParentById(id);
//	}
}