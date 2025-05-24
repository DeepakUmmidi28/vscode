package com.deepak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.model.JobPost;

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
}
