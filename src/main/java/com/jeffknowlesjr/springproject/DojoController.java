package com.jeffknowlesjr.springproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	
	@RequestMapping("")
	public String dojo() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("tysons-dojo")
	public String tysons() {
		return "I love Tysons corner dojo!";
	}
	
	@RequestMapping("san-jose")
	public String sanjose() {
		return "SJ dojo is the headquarters";
	}
	
}
