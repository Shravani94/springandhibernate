package com.techouts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
	@RequestMapping("/bookingForm")
	public String bookForm(Model model) {
		Registration res=new Registration();
		model.addAttribute("reservation",res);
		return"bookingForm";
	}
	@RequestMapping("/confirm")
	public String confirm(Model model) {
		Registration res=new Registration();
		model.addAttribute("reservation",res);
		return"submitForm";
		
	}

}
