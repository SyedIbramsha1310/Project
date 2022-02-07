package com.thoughtfocus.assessment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.assessment.entity.ApplicationEntity;
import com.thoughtfocus.assessment.repository.ApplicationRepositoy;

@Service
public class LoginServiceImpl implements LoginService {
	
	private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	ApplicationRepositoy repo;
	
	@Override
	public ApplicationEntity validatelogindetails(String username, String password) {
		
		ApplicationEntity entity = null;
		try {
			if (username!=null && password!=null) {
				entity =repo.getByUsernameAndPassword(username, password);
				if (entity!=null) {
					logger.info("Data Saved Successfully");
				} else {
					logger.info("Data Not Found");
				}
			} else {
				logger.info("Invalid Username and Password");
//				throw new InvalidusernameException("Username eneterd is Invalid");
			}
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return entity;

	}

}
