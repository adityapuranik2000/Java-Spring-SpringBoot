package com.src.JobFeed.repo;

import com.src.JobFeed.model.JobData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobData> job = new ArrayList<>(Arrays.asList(new JobData(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
            List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")), new JobData(2, "Frontend Developer", "Experience in building responsive web applications using React",
            3, List.of("HTML", "CSS", "JavaScript", "React")),new JobData(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
            List.of("Python", "Machine Learning", "Data Analysis"))));


    public void addJob(JobData jobs){
          job.add(jobs);
    }

    public List<JobData> getAllJobs(){
        return job;
    }
}
