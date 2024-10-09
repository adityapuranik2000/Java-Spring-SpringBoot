package com.src.JobFeed.controller;


import com.src.JobFeed.model.JobData;
import com.src.JobFeed.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    JobService service;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(@ModelAttribute JobData jobPost, Model model){

        model.addAttribute("jobPost", jobPost);
        service.addJob(jobPost);
        //System.out.println(jobPost.toString());
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewalljobs(Model model){
        List<JobData> data = service.getAllJobs();
       model.addAttribute("jobPost",data);
       return "viewalljobs";
    }
}
