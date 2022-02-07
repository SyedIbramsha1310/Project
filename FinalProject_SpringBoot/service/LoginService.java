package com.thoughtfocus.assessment.service;

import com.thoughtfocus.assessment.entity.ApplicationEntity;

public interface LoginService {

	ApplicationEntity validatelogindetails(String username, String password);

}
