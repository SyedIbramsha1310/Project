package com.thoughtfocus.assessment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.assessment.dto.ForgotPasswordDTO;
import com.thoughtfocus.assessment.entity.ApplicationEntity;
import com.thoughtfocus.assessment.repository.ApplicationRepositoy;

@Service
public class forgotPasswordServiceImpl implements forgotPasswordService {
	
private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	ApplicationRepositoy repo;
	

	@Override
	public ApplicationEntity updateDetails(ForgotPasswordDTO dto) {
		try {
//			if (dto.getUsername()!="" && dto.getPassword()!="") {
				
				ApplicationEntity entity = repo.getByUsername("Sana_Sana");
				System.out.println(entity.toString());
				entity.setPassword(dto.getPassword());
				System.out.println(dto.getPassword());
				return entity;
//			} else {
				
//			}
		} catch (Exception e) {
			
		}
		return null;
	}


}
