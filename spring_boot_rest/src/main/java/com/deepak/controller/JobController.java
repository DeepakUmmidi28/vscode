package com.deepak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.model.JobPost;
import com.deepak.service.jobService;

@RestController 
public class JobController {
    @Autowired
    private jobService service;

    @GetMapping("/JobPosts")
    // @ResponseBody
    public List<JobPost> findAllJobs(){
        return service.findAllJobs();
    }

    @GetMapping("/JobPosts/{jobId}")
    public JobPost findJob(@PathVariable int jobId){
        return service.findJob(jobId);
    }

    @PostMapping("/JobPosts")
    public void addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
    }

    @PutMapping("/JobPosts")
    public void updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
    }

    @DeleteMapping("/JobPosts/{jobId}")
    public void deleteJob(@PathVariable int jobId){
        service.deleteJob(jobId);
    }
}
