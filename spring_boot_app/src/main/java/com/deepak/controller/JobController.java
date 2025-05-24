package com.deepak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deepak.model.JobPost;
import com.deepak.service.jobService;

@Controller
public class JobController {

    @Autowired
    private jobService service;

    @ModelAttribute("jobPosts")
    public List<JobPost> populateJobPosts() {
        return service.findAllJobs();
    }

    @RequestMapping({"/","/home"})
    public String home() {
        return "index";
    }

    @RequestMapping("/viewalljobs")
    public String viewAllJobs() {
        return "viewalljobs";
    }

    @RequestMapping("/addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }
}
