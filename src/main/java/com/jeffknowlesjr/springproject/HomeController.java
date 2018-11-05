package com.jeffknowlesjr.springproject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController extends HttpServlet {
	@RequestMapping("/")
	public String index(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("count") == null) {
	        session.setAttribute("count", 0);
		}
		int counter = (int) session.getAttribute("count");
		counter++;
		session.setAttribute("count", counter);
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
	@RequestMapping("/counter")
	public String counter(HttpSession session, @RequestParam(value="reset", required=false) Boolean reset) {
		if (session.getAttribute("count") == null) {
	        session.setAttribute("count", 0);
		} 
		if ( reset != null && reset == true ) {
			session.setAttribute("count", 0);
		}
		return "counter.jsp";
	}
}
 