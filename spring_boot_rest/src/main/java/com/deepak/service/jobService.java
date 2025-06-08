package com.deepak.service;

import java.util.ArrayList;
import java.util.Arrays;
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
        repo.save(jobPost);
    }

    public List<JobPost> findAllJobs(){
        return repo.findAll();
    }

    public JobPost findJob(int jobId) {
        return repo.findById(jobId).orElse(null);
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int jobId) {
        repo.deleteById(jobId);
    }

    public void load() {
        List<JobPost> jobs=new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer","Java, Spring Boot, Microservices",3,new ArrayList<>(Arrays.asList("Java","Spring Boot","Microservices"))),
            new JobPost(2,"Python Developer","Python, Django, REST API",2,new ArrayList<>(Arrays.asList("Python","Django","REST API"))),
            new JobPost(3,"Frontend Developer","React, JavaScript, CSS",1,new ArrayList<>(Arrays.asList("React","JavaScript","CSS"))),
            new JobPost(4,"Data Scientist","Python, Machine Learning, Data Analysis",4,new ArrayList<>(Arrays.asList("Python","Machine Learning","Data Analysis"))),
            new JobPost(5,"DevOps Engineer","AWS, Docker, Kubernetes",3,new ArrayList<>(Arrays.asList("AWS","Docker","Kubernetes")))
            ));
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }

}

    // public void addJob(JobPost jobPost) {
    //     repo.addJob(jobPost);
    // }

    // public List<JobPost> findAllJobs(){
    //     return repo.findAllJobs();
    // }

    // public JobPost findJob(int jobId) {
    //     List<JobPost> jobs=repo.findAllJobs();
    //     for(JobPost job: jobs){
    //         if(jobId==job.getPostId()){
    //             return job;
    //         }
    //     }
    //     return null;
    // }

    // public void updateJob(JobPost jobPost) {
    //     repo.updateJob(jobPost);
    // }

    // public void deleteJob(int jobId) {
    //     repo.deleteJob(jobId);
    // }

