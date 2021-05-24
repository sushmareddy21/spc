package com.cg.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "student_cp")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private LocalDate dateOfBirth;
	private String name;
	private String emailId;
	private String mobileNumber;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "classId")
	private ClassId currentClass;
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Subject> subjects = new ArrayList<>();
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "addressId")
	private Address address;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "classdairy_id")
	private ClassDiary classDiary;
	
	public Student() {
		
	}
	public Student(int userId) {
		this.userId = userId;
	}
	
	public Student(LocalDate dateOfBirth, String name, String emailId, String mobileNumber,
			ClassId currentClass, List<Subject> subjects) {
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.currentClass = currentClass;
		this.subjects = subjects;
	}

	public Student(int userId, LocalDate dateOfBirth, String name, String emailId, String mobileNumber) {
		super();
		this.userId = userId;
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public Student( LocalDate dateOfBirth, String name, String emailId, String mobileNumber, ClassId currentClass) {
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.currentClass = currentClass;
	}
	
	public Student(int userId, LocalDate dateOfBirth, String name, String emailId, String mobileNumber,
			ClassId currentClass, List<Subject> subjects, Address address, ClassDiary classDiary) {
		super();
		this.userId = userId;
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.currentClass = currentClass;
		this.subjects = subjects;
		this.address = address;
		this.classDiary = classDiary;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public ClassId getCurrentClass() {
		return currentClass;
	}
	public void setCurrentClass(ClassId currentClass) {
		this.currentClass = currentClass;
	}
	  
	public void addSubject(Subject subject) 
	{
		subject.setStudent(this);
		subjects.add(subject);
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ClassDiary getClassDiary() {
		return classDiary;
	}
	public void setClassDiary(ClassDiary classDiary) {
		this.classDiary = classDiary;
	}	
	@Override
	public String toString() {
		return "Student [userId=" + userId + ", dateOfBirth=" + dateOfBirth + ", name=" + name + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", currentClass=" + currentClass + ", subjects=" + subjects
				+ ", address=" + address + ", classDiary=" + classDiary + "]";
	}
	
}