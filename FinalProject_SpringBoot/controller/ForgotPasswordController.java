package com.thoughtfocus.assessment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.thoughtfocus.assessment.service.forgotPasswordService;
import com.thoughtfocus.assessment.dto.ForgotPasswordDTO;
import com.thoughtfocus.assessment.entity.ApplicationEntity;

@RestController
public class ForgotPasswordController {
	
	private static Logger logger = LoggerFactory.getLogger(ForgotPasswordController.class);
	
	
	@Autowired
	forgotPasswordService forgotPasswordService;
	
	@PostMapping("/forgotpassword")
	public String updatePasswordByUserName(@RequestBody ForgotPasswordDTO forgotPasswordDto) {
		
		ApplicationEntity applicationEntity = null;

		try {
			if (forgotPasswordDto.getUsername() != "" && forgotPasswordDto.getPassword() != "") {

				applicationEntity = forgotPasswordService.updateDetails(forgotPasswordDto);
				if (applicationEntity != null) {
					logger.info("Password Updated");
				} else {
					logger.info("Enter valid Username");
					
				}

			} else {
				logger.info("Please Enter the valid details");
			}
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return "Password Updated";
	}

}
