package com.unit.spring.group.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Group {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int division;
    private int grade;
    private String name;
    private String subName;
    
    private int activityIndex;
    private boolean activation;

    @Lob
    private String description;

    private String image;
    private String keyword;
    private String creator;
    private String channel;

    @CreatedDate
    private LocalDateTime createdDate;
}