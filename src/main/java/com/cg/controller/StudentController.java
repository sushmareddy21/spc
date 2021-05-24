package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.details.StudentDetails;
import com.cg.dto.CreateStudentRequest;
import com.cg.entities.Student;
import com.cg.entities.Subject;
import com.cg.service.IStudentService;
import com.cg.service.StudentService;
import com.cg.util.StudentUtil;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@Autowired
	private StudentUtil studentUtil;

	@PostMapping(value = "/add")
	public StudentDetails addStudent(@RequestBody CreateStudentRequest requestData) {
		System.out.println("requestData: " + requestData);
		Student student = new Student(requestData.getDateOfBirth(), requestData.getName(), requestData.getEmailId(),
				requestData.getMobileNumber(), requestData.getCurrentClass());
		List<Subject> subjectSet = requestData.getSubjects();
		if (subjectSet != null) {
			for (Subject subject : subjectSet) {
				student.addSubject(subject);
			}
		}
		student.setAddress(requestData.getAddress());
		student.setClassDiary(requestData.getClassDiary());
		System.out.println("stud : " + student);
		Student stud = studentService.addStudent(student);
		StudentDetails details = studentUtil.toDetails(stud);
		return details;
	}

	@PutMapping(value = "/update")
	public Student updateStudent(@RequestBody @Valid Student student) 
	{		
		return studentService.updateStudent(student);				
    }

	@DeleteMapping(value = "/delete/{id}")
	public Student deleteStudent(@PathVariable("id") int id) 
	{
		return studentService.deleteStudent(id);				
    }
	
	@GetMapping(value = "/get/{id}")
	public StudentDetails getStudent(@PathVariable("id") int id) 
	{
		Student stud = studentService.getStudent(id);
		StudentDetails details = studentUtil.toDetails(stud);
		return details;
    }
}