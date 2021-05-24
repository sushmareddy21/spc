package com.cg.details;

import java.time.LocalDate;
import java.util.List;

import com.cg.entities.Address;
import com.cg.entities.ClassDiary;
import com.cg.entities.ClassId;
import com.cg.entities.Subject;


public class StudentDetails 
{
	private long userId;
	private LocalDate dateOfBirth;
	private String name;
	private String emailId;
	private String mobileNumber;
	private ClassId currentClass;
	private List<Subject> subjects;
	private Address address;
	private ClassDiary classDiary;
	public StudentDetails() {
	}
	
	public StudentDetails(long userId, LocalDate dateOfBirth, String name, String emailId, String mobileNumber, ClassId currentClass) {
		super();
		this.userId = userId;
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.currentClass = currentClass;
	}
    
//	public StudentDetails(long userId, LocalDate dateOfBirth, String mobileNumber, String name, String emailId,
//			List<SubjectDetails> subjects) {
//		super();
//		this.userId = userId;
//		this.dateOfBirth = dateOfBirth;
//		this.mobileNumber = mobileNumber;
//		this.name = name;
//		this.emailId = emailId;
//		this.subjects = subjects;
//	}

     
	public long getUserId() {
		return userId;
	}

	public StudentDetails(long userId, LocalDate dateOfBirth, String name, String emailId, String mobileNumber,
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

	public void setUserId(long userId) {
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
		return "StudentDetails [userId=" + userId + ", dateOfBirth=" + dateOfBirth + ", name=" + name + ", emailId="
				+ emailId + ", mobileNumber=" + mobileNumber + ", currentClass=" + currentClass + "]";
	}


}
