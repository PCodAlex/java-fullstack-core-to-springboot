package org.akash.app;

import java.util.List;

import org.akash.app.model.JobPost;
import org.akash.app.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class JobController {
	
	@Autowired
	private JobService jbService;
	
	@GetMapping({"/","home"})
	public String home() {
		return "home";
	}
	
	@GetMapping("addjob")
	public String addJob() {
		return "addjob";
	}
	
	@PostMapping("handleForm")
	public String handleForm(@ModelAttribute JobPost jobpost) {
		jbService.addJob(jobpost);
		return "success";
	}
	
	@GetMapping("viewalljobs")
	public String viewJobs(Model model) {
		List<JobPost> jobs=jbService.getAllJobs();
		model.addAttribute("jobPosts",jobs);
		return "viewalljobs";
	}
	
}
