package com.cg.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.cg.entities.Address;
import com.cg.entities.ClassDiary;
import com.cg.entities.ClassId;
import com.cg.entities.Subject;

//import javax.persistence.CascadeType;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

//import com.cg.spc.entities.Address;
//import com.cg.spc.entities.ClassDiary;
//import com.cg.spc.entities.ClassId;
//import com.cg.spc.entities.Subject;
import com.fasterxml.jackson.annotation.JsonFormat;

public class CreateStudentRequest {
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	@NotBlank
	@Size(min = 2, max = 20)
	private String name;
	private String emailId;
	private String mobileNumber;
	private ClassId currentClass;
	private List<Subject> subjects;
	private Address address;
	private ClassDiary classDiary;

	public CreateStudentRequest() {
		super();
	}

//	public CreateStudentRequest(LocalDate dateOfBirth, String name, String emailId, String mobileNumber,
//			ClassId currentClass, List<Subject> subjects) {
//		super();
//		this.dateOfBirth = dateOfBirth;
//		this.name = name;
//		this.emailId = emailId;
//		this.mobileNumber = mobileNumber;
//		this.currentClass = currentClass;
//		this.subjects = subjects;
//	}
	public CreateStudentRequest(LocalDate dateOfBirth, String name, String emailId, String mobileNumber,
			ClassId currentClass, List<Subject> subjects, Address address) {
		super();
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.currentClass = currentClass;
		this.subjects = subjects;
		this.address = address;
	}

//		public CreateStudentRequest(@Max(100) LocalDate dateOfBirth, ClassId currentClass, List<Subject> subjects,
//				@NotBlank @Size(min = 2, max = 20) String name, Address address, ClassDiary classDiary, String emailId,
//				String mobileNumber) {
//			super();
//			this.dateOfBirth = dateOfBirth;
//			this.currentClass = currentClass;
//			this.subjects = subjects;
//			this.name = name;
//			this.address = address;
//			this.classDiary = classDiary;
//			this.emailId = emailId;
//			this.mobileNumber = mobileNumber;
//		}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
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
		return "CreateStudentRequest [dateOfBirth=" + dateOfBirth + ", name=" + name + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", currentClass=" + currentClass + ", subjects=" + subjects
				+ ", address=" + address + ", classDiary=" + classDiary + "]";
	}
}