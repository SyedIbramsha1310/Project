package com.thoughtfocus.assessment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.thoughtfocus.assessment.dto.ApplicationDTO;
import com.thoughtfocus.assessment.service.RegisterService;

@RestController
public class RegistrationController {
	
	static Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@Autowired
	RegisterService registerService;

	@PostMapping("/register")
	public String getRegisterDetails(@RequestBody ApplicationDTO applicationDTO) {

		try {
			if (applicationDTO != null) {

				boolean data = registerService.validateRegisterDetails(applicationDTO);
				if (data) {
					logger.info("Data's are Registered Successfully" + applicationDTO);
					return "Data's are Registered Successfully";
				} else {
					logger.info("Data not Saved");
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return "Data's are Registered Successfully";
	}

}
