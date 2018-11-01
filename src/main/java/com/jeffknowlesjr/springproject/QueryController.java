package com.jeffknowlesjr.springproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

	@RequestMapping("/")
	public String index(@RequestParam(value="fn", required=false) String first_name, @RequestParam(value="ln", required=false) String last_name) {
		if(first_name == null) {
			return "Greetings Human!";
		} else if(first_name != null && last_name == null) {
			return "Greetings  " + first_name + "!";
		} 
//		Dead Code has me confused!! -- Why? --
		else if(first_name == null && last_name != null) {
			return "Greetings " + last_name + " human!";
		} else {
			return "Greetings " + first_name + " " + last_name + "!";
		}
	}
	
}
