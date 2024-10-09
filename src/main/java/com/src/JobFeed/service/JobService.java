package com.src.JobFeed.service;

import com.src.JobFeed.model.JobData;
import com.src.JobFeed.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo repo;

    public void addJob(JobData job){
        repo.addJob(job);
    }

    public List<JobData> getAllJobs(){
        return repo.getAllJobs();
    }
}
