package com.techouts;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
	@RequestMapping("/hello")
	public String display(Model m)
	{
		m.addAttribute("emp",new Person());
		return "viewpage";
	}
	@RequestMapping("/helloagain")
	public String redisplay(@Valid@ModelAttribute("emp")Person p,BindingResult br) {
		if(br.hasErrors()) {
			return "viewpage";
		}
		else {
			return "final";
		}
		
		
	}
}
