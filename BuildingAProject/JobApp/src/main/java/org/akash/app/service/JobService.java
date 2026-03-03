package org.akash.app.service;

import java.util.List;

import org.akash.app.model.JobPost;
import org.akash.app.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
	
	@Autowired
	private JobRepo jbRepo;
	
	public void addJob(JobPost jobPost) {
		jbRepo.addJob(jobPost);
	}
	public List<JobPost> getAllJobs(){
		return jbRepo.getAllJobs();
	}
	
}
