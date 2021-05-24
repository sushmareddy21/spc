package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.User;
@Repository
public interface IUserRepository extends JpaRepository<User,Integer>
{
//public  User addNewUser(User user);
//public User signIn(User user);
//public User signOut(User user);
}
