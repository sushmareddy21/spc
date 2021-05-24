package com.cg.service;

import java.util.List;

import com.cg.entities.Student;

public interface IStudentService {
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student deleteStudent(int id);
    public List<Student> retrieveAllStudents();
//	public Student retrieveStudentById(int id);
	public Student getStudent(int id);
	

}