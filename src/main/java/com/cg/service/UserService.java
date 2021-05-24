package com.cg.service;



import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IAdminRepository;
import com.cg.dao.IUserRepository;
import com.cg.entities.Admin;
import com.cg.entities.User;
import com.cg.exception.StudentIDNotFoundException;
import com.cg.util.Role;





@Service("uService")
@Transactional
public class UserService implements IUserService {

	//private Logger logger = Logger.getLogger(UserService.class);

	@Autowired
	private IUserRepository userRepo;
	@Autowired
	private IAdminRepository adminRepo;

	/**
	 * User class method for adding new user details into user repository.
	 */
	@Override
	public User addNewUser(User user) {
		return userRepo.save(user);
	}

	/**
	 * 
	 * User Service method for checking user existence in user repository.
	 * 
	 * @exception IdNotFoundException
	 */
	@Override
	public User signIn(User user) {
		Optional<User> opt = userRepo.findById(user.getUserId());
		if (!opt.isPresent()) {
			throw new StudentIDNotFoundException("not found");
		}
		//logger.info("User Signed In : " + opt.get());
		return opt.get();
	}

	/**
	 * User Service method for checking out the user.
	 * 
	 * @exception IdNotFoundException
	 */
	@Override
	public User signOut(User user) {
		Optional<User> opt = userRepo.findById(user.getUserId());
		if (!opt.isPresent()) {
			throw new StudentIDNotFoundException("not found");
		}

		//logger.info("User Signed Out : " + opt.get());
		return opt.get();
	}

	/**
	 * User class method for adding admin details into user and admin repository.
	 */
	/*@Override
	public User addNewAdmin(Admin admin) {
//		System.out.println(admin.getUserId());
		User adminUser = userRepo.save(new User(admin.getPassword(), Role.ADMIN));
		Admin adminReturn = adminRepo.save(new Admin(adminUser.getUserId(), admin.getAdminName(),
				admin.getAdminContact(), adminUser.getPassword()));
		logger.info("New Admin Created : " + adminReturn);
		return adminUser;
	}*/

}