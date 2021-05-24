package com.cg.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IStudentRepository;
import com.cg.entities.Student;
import com.cg.exception.StudentIDNotFoundException;

@Service
@Transactional
public class StudentService implements IStudentService {
	@Autowired
	private IStudentRepository sDao;

	private Logger logger = LoggerFactory.getLogger(StudentService.class);

	@Override
	public Student addStudent(Student student) {
		logger.info("*** adding : "+ student);
		Student stud = sDao.save(student);
		return stud;
	}

	@Override
	public Student updateStudent(Student student) {
		logger.info("*** udating : " + student);
		Student stud = sDao.save(student);
		return stud;

	}

	@Override
	public Student deleteStudent(int id) {
		logger.info("***Deleting Student by Id: " + id + "***");
		Optional<Student> opt = sDao.findById(id);
		if (!opt.isPresent()) {
			throw new StudentIDNotFoundException("Student not found for id: " + id);
		}
		Student stud = opt.get();
		sDao.delete(stud);
		return stud;
	}

	@Override
	public List<Student> retrieveAllStudents() {
		List<Student> studList = new ArrayList<>();
		// sDao.findAll();
		return studList;
	}

//	@Override
//	public Student retrieveStudentById(int id) {
//		Optional<Student> opt = sDao.findById(Id);
//		if(!opt.isPresent()) 
//		{
//			throw new StudentIDNotFoundException("Student not found for id: "+Id);
//		}
//		Student stud = opt.get();
//		return stud;
//		return null;
//	}

	@Override
	public Student getStudent(int id) {
		logger.info("***Retrieving Student by Id: " + id + "***");
		Optional<Student> opt = sDao.findById(id);
		if(!opt.isPresent()) 
		{
			throw new StudentIDNotFoundException("Student not found for id: " + id);
		}
		Student stud = opt.get();
		return stud;
	}

}