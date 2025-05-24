package com.deepak.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.deepak.model.JobPost;

@Repository
public class jobRepo {

    List<JobPost> jobs=new ArrayList<>(
        Arrays.asList(
            new JobPost(1,"Java Developer","Java, Spring Boot, Microservices",3,new ArrayList<>(Arrays.asList("Java","Spring Boot","Microservices"))),
            new JobPost(2,"Python Developer","Python, Django, REST API",2,new ArrayList<>(Arrays.asList("Python","Django","REST API"))),
            new JobPost(3,"Frontend Developer","React, JavaScript, CSS",1,new ArrayList<>(Arrays.asList("React","JavaScript","CSS"))),
            new JobPost(4,"Data Scientist","Python, Machine Learning, Data Analysis",4,new ArrayList<>(Arrays.asList("Python","Machine Learning","Data Analysis"))),
            new JobPost(5,"DevOps Engineer","AWS, Docker, Kubernetes",3,new ArrayList<>(Arrays.asList("AWS","Docker","Kubernetes")))
            ));

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
    }

    public List<JobPost> findAllJobs() {
        return jobs;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost job: jobs){
            if(jobPost.getPostId()==job.getPostId()){
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExperience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int jobId) {
        for(JobPost job:jobs){
            if(job.getPostId()==jobId){
                jobs.remove(job);
                break;
            }
        }
    }

}
