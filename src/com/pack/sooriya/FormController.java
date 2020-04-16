package com.pack.sooriya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/showForm")
	public String showForm()
	{
		return "showForm";
	}
	
}
