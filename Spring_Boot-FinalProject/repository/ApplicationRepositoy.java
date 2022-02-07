package com.thoughtfocus.assessment.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtfocus.assessment.entity.ApplicationEntity;

public interface ApplicationRepositoy extends JpaRepository<ApplicationEntity, Integer> {
	
	public ApplicationEntity getByEmail(String email);

	public ApplicationEntity getByUsernameAndPassword(String username, String password);

	public ApplicationEntity getByUsername(String username);
	
	

}
