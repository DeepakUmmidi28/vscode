package com.deepak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.model.JobPost;
import com.deepak.repo.jobRepo;

@Service
public class jobService {

    @Autowired
    private jobRepo repo;

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public List<JobPost> findAllJobs(){
        return repo.findAllJobs();
    }

    public JobPost findJob(int jobId) {
        List<JobPost> jobs=repo.findAllJobs();
        for(JobPost job: jobs){
            if(jobId==job.getPostId()){
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int jobId) {
        repo.deleteJob(jobId);
    }
}
