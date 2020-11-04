package com.hcl.patienttracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hcl.patienttracking.model.User;
import com.hcl.patienttracking.repository.UserDAOImpl;

/**
 * Day#:44
 * 
 * This class is to register the user.
 * 
 * @author kasthuri.s
 *
 */
@Component
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAOImpl userDAO;
	public boolean register(User user) {
		return userDAO.register(user);
	}
	
	
}
