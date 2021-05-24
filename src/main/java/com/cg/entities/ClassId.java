package com.cg.entities;

//import java.util.ArrayList;
//import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "classid_cp")
public class ClassId {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classId;
	private int grade;
	private char division;
	// @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
	// private Teacher classTeacher;
//	@OneToMany
//	private List<Teacher> subjectTeachers = new ArrayList();

	ClassId(int grade, char division) {
		this.grade = grade;
		this.division = division;
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

	public int getClassId() {
		return classId;
	}


	public void setClassId(int classId) {
		this.classId = classId;
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

	public ClassId() {
		super();
	}


	@Override
	public String toString() {
		return "ClassId [classId=" + classId + ", grade=" + grade + ", division=" + division + "]";
	}


}