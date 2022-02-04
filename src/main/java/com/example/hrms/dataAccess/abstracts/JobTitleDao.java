package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concrete.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {
}
