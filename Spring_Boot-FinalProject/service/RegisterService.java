package com.thoughtfocus.assessment.service;

import com.thoughtfocus.assessment.dto.ApplicationDTO;

public interface RegisterService {

	boolean validateRegisterDetails(ApplicationDTO applicationDTO);

}
