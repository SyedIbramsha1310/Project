package com.thoughtfocus.assessment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtfocus.assessment.entity.ApplicationEntity;
import com.thoughtfocus.assessment.exception.LoginDetailsRequiredNullException;
import com.thoughtfocus.assessment.service.LoginService;

@RestController
public class LoginController {
	
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	LoginService loginservice;

	@PostMapping("/login")
	public ApplicationEntity getLoginDetails(@RequestParam String username, @RequestParam String password) {
		ApplicationEntity entity = null;
		try {
			if (username != null  && (password != null)) {
				entity = loginservice.validatelogindetails(username, password);
				if (entity != null) {
					logger.info("HEllo");
				} else {
					logger.info("UserName not Found");
				}
			} else {
				logger.info("Username & Password required");
				throw new LoginDetailsRequiredNullException("Username & Password required");
			}
		} catch (Exception e) {
			logger.error(e.getMessage());

		}
		return entity;
	}

}
