package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "subject_cp")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subjectId;
	private String title;
	@ManyToOne
	@JoinColumn(name = "userId")
	private Student student;
	
	public Subject() {

	}

	public Subject(String title) {
		this.title = title;
	}

	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	// to avoid recursion during serialization of Student
	@JsonIgnore
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", title=" + title + "]";
	}
	
}