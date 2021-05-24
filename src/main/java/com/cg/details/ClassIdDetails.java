package com.cg.details;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class ClassIdDetails {
	private int grade;
	private char division;

	// @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
	// private Teacher classTeacher;
//	@OneToMany
//	private List<Teacher> subjectTeachers = new ArrayList();
	public ClassIdDetails() {
		super();
	}

	public ClassIdDetails(int grade, char division) {
		this.grade = grade;
		this.division = division;
//		this.classId = "" + this.grade + this.division;

	}
//	public ClassId(String classId, int grade, char division, List<Teacher> subjectTeachers) {
//	super();
//	this.classId = classId;
//	this.grade = grade;
//	this.division = division;
//	//this.classTeacher = classTeacher;
//	this.subjectTeachers = subjectTeachers;
//}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public char getDivision() {
		return division;
	}

	public void setDivision(char division) {
		this.division = division;
	}

}