package com.thoughtfocus.assessment.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ApplicationDTO {
	
	private String username;
	private String email;
	private String password;
	private String confirmpassword;
	private long contact;

}
