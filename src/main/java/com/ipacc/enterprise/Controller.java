package com.ipacc.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipacc.enterprise.config.User;

@RestController
public class Controller {
	@Autowired
	User user;
	
	@RequestMapping("/ping")
	public String ping() {
		return "firstname: " + user.getFirstName() + " lastname: " + user.getLastName() + " username: " + user.getUsername() + " Password: " + user.getPassword();
	}
}
