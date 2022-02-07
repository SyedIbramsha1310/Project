package com.thoughtfocus.assessment.service;

import com.thoughtfocus.assessment.dto.ForgotPasswordDTO;
import com.thoughtfocus.assessment.entity.ApplicationEntity;

public interface forgotPasswordService {

	public ApplicationEntity updateDetails(ForgotPasswordDTO forgotPasswordDto);

}
