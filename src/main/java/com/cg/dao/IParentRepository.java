package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Parent;

@Repository
public interface IParentRepository extends JpaRepository<Parent, Integer> {
	// public Parent addParent(Parent parent);
	// public Parent updateParent(Parent parent);
	// public List<Parent> retrieveParentListByClass(ClassId classId);
	// public Parent retrieveParentByStudent(Student student);
	// public Parent retrieveParentById(int id);

}