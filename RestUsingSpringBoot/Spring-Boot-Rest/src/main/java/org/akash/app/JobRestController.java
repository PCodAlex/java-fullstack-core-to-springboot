package org.akash.app;

import java.util.List;

import org.akash.app.model.JobPost;
import org.akash.app.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {
	
	@Autowired
	private JobService jobService;
	
//	@ResponseBody
	@GetMapping("jobPosts")
//	@GetMapping(path="jobPosts",produces="application/xml")
	public List<JobPost> getAllJobs() {
		return jobService.getAllJobs();
	}
	
	@GetMapping("jobPosts/{postId}")
	public JobPost getJob(@PathVariable("postId") int postId) {
		return jobService.getJob(postId);
	}
	
	@PostMapping("jobPosts")
	public JobPost addJob(@RequestBody JobPost jobPost) {
		jobService.addJob(jobPost);
		return jobService.getJob(jobPost.getPostId());
	}
	
	@PutMapping(path="jobPosts",consumes="application/xml")
	public JobPost updateJob(@RequestBody JobPost jobPost) {
		jobService.updateJob(jobPost);
		return jobService.getJob(jobPost.getPostId());
	}
	
	@DeleteMapping("jobPosts/{postId}")
	public String deleteJob(@PathVariable int postId) {
		if(!jobService.deletePost(postId)) {
			return "id not found";
		}
		return "deleted";
	}
}
