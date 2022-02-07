package com.thoughtfocus.assessment.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ForgotPasswordDTO {
	
	private String username;
	private String password;

}
