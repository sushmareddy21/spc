package com.cg.service;

import java.util.List;

import com.cg.entities.ClassId;
import com.cg.entities.Parent;
import com.cg.entities.Student;

public interface IParentService {
	public Parent addParent(Parent parent, Integer id);
	public Parent updateParent(Parent parent);
	public List<Parent> retrieveParentListByClass(ClassId classId);
	public Parent retrieveParentByStudent(Student student);
	public Parent retrieveParentById(int id);
	
}