package com.src.JobFeed.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class JobData {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    List<String> postTechStack;
}
