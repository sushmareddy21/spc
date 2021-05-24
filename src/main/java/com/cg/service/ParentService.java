package com.cg.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IParentRepository;
import com.cg.dao.IStudentRepository;
import com.cg.entities.ClassId;
import com.cg.entities.Parent;
import com.cg.entities.Student;
import com.cg.exception.ParentNotFoundException;
import com.cg.exception.StudentIDNotFoundException;

@Service
@Transactional
public class ParentService implements IParentService {

	@Autowired
	private IParentRepository iparentRepository;
	@Autowired
	private IStudentRepository sDao;
	private Logger logger = LoggerFactory.getLogger(ParentService.class);

	@Override
	public Parent addParent(Parent parent, Integer id) {
		Optional<Student> opt = sDao.findById(id);
		if (!opt.isPresent()) {
			throw new StudentIDNotFoundException("Student not found for id: " + id);
		}	
		Student stud = opt.get();
		parent.setStudent(stud);
		return iparentRepository.save(parent);
	}

	public List<Parent> retrieveParentListByClass(ClassId classId) {
//		List<Parent> parents = new ArrayList<>();
//		iparentRepository.findAll().forEach(parents::add);
//		return parents;
		return null;
	}

	@Override
	public Parent updateParent(Parent parent) {
		return iparentRepository.save(parent);

	}

	@Override
	public Parent retrieveParentByStudent(Student student) {

		// return iparentRepository.retrieveParentByStudent(student);
		return null;
	}

	@Override
	public Parent retrieveParentById(int id) {
		Optional<Parent> opt = iparentRepository.findById(id);
		if(!opt.isPresent())
		{
			throw new ParentNotFoundException("No Parent found for id: " + id);
		}
		Parent parent  = opt.get();
		logger.info("***Retrieved Parent by Id: " + parent);
		return parent;
	}

}