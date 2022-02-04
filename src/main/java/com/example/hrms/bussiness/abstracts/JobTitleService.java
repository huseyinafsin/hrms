package com.example.hrms.bussiness.abstracts;

import com.example.hrms.entities.concrete.JobTitle;

import java.util.List;

public interface JobTitleService {
    List<JobTitle> getAll();
}
