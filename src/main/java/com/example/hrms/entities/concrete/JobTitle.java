package com.example.hrms.entities.concrete;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "job_titles")
public class JobTitle {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;



}
