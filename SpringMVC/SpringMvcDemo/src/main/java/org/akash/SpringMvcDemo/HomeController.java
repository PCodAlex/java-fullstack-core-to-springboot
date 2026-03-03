package org.akash.SpringMvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		System.out.println("server working");
		return "index";
	}
	
	@ModelAttribute("courseName")
	public String courseInfo() {
		return "java";
	}
	
	@PostMapping("add")
	public ModelAndView add(@RequestParam int num1,@RequestParam int num2,ModelAndView mv) {
		
		int result=num1+num2;
		mv.addObject("result", result);
		mv.setViewName("result");
		
		return mv;
	}
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute Alien alien,Model model) {
		model.addAttribute("alien", alien);
		return "result";
	}
	
}
