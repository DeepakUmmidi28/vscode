package com.deepak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> findAllJobs(){
        List<JobPost> jobs=service.findAllJobs();
        return ResponseEntity.status(200).body(jobs);
        // return new ResponseEntity<>(jobs,HttpStatus.OK);
    }

    @GetMapping("/JobPosts/{jobId}")
    public ResponseEntity<?> findJob(@PathVariable int jobId){
        JobPost jobPost=service.findJob(jobId);
        if(jobPost!=null){
            return new ResponseEntity<>(jobPost,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/JobPosts")
    public ResponseEntity<?> addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/JobPosts")
    public ResponseEntity<?> updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/JobPosts/{jobId}")
    public ResponseEntity<?> deleteJob(@PathVariable int jobId){
        service.deleteJob(jobId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/loadData")
    public ResponseEntity<?> loadData(){
        service.load();
        return new ResponseEntity<>("Data Loaded Successfully", HttpStatus.OK);
    }

    @GetMapping("/JobPosts/keyword/{keyword}")
    public ResponseEntity<List<JobPost>> search(@PathVariable String keyword){
        List<JobPost> jobs=service.search(keyword);
        return new ResponseEntity<>(jobs,HttpStatus.OK);
    }
}
