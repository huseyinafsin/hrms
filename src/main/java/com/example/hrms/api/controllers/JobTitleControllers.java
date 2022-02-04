package com.example.hrms.api.controllers;

import com.example.hrms.bussiness.abstracts.JobTitleService;
import com.example.hrms.entities.concrete.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitleControllers {
    private JobTitleService jobTitleService;

    @Autowired
    public JobTitleControllers(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/getall")
    public List<JobTitle> getAll(){
        return this.jobTitleService.getAll();
    }
}
