package com.jeffknowlesjr.springproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("dojoName","Tysons Corner");
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("app","date");
		return "dateTime.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("app","time");
		return "dateTime.jsp";
	}
}
 