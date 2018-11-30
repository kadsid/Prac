package com.mymm.app.welcome;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@ResponseStatus(value=HttpStatus.OK)
	@RequestMapping(value="/hello")
	public String sayHello() {
		return "Hello";
	}

}
