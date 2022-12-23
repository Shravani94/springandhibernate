package com.techouts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/enter")
	public String show() {
	return "Hello Spring Boot";

}
}
