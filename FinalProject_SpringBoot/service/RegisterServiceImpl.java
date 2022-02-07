package com.thoughtfocus.assessment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.assessment.dto.ApplicationDTO;
import com.thoughtfocus.assessment.entity.ApplicationEntity;
import com.thoughtfocus.assessment.exception.PasswordMismatachingExcetion;
import com.thoughtfocus.assessment.repository.ApplicationRepositoy;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	private static Logger logger = LoggerFactory.getLogger(RegisterServiceImpl.class);
	
	@Autowired
	ApplicationRepositoy repositoy;
	
	@Override
	public boolean validateRegisterDetails(ApplicationDTO applicationDTO) {
		try {
			if (applicationDTO.getPassword().equals(applicationDTO.getConfirmpassword())) {
				ApplicationEntity entity = new ApplicationEntity();
				BeanUtils.copyProperties(applicationDTO, entity);
				repositoy.save(entity);
				logger.info("Data Saved Successfully");
				return true;

			} else {
				logger.info("Password MisMatching Enter a Valid Password");
				throw new PasswordMismatachingExcetion("Password Mismatching");
			}
	} catch (Exception e) {
		logger.error(e.getMessage());
		e.getStackTrace();	
		e.getMessage();
	}
		return false;
	}

}
