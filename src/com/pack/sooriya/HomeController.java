package com.pack.sooriya;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHome()
	{
		return "homePage";
	}
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("studentName") String name,Model model)
	{
		name = name.toUpperCase();
		String result = "Ms. " + name;
		model.addAttribute("message", result);
		return "confirmData";
	}
}
