package com.example.hrms.bussiness.concrete;

import com.example.hrms.bussiness.abstracts.JobTitleService;
import com.example.hrms.dataAccess.abstracts.JobTitleDao;
import com.example.hrms.entities.concrete.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {
    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        super();
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public List<JobTitle> getAll() {
        return this.jobTitleDao.findAll();
    }
}
