package com.cg.service;

import com.cg.entities.User;

public interface IUserService {
public  User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
}
