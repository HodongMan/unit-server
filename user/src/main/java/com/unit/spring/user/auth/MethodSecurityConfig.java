package com.unit.spring.user.auth;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;


@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {
    
    //@Autowired
    //private OAuth2SecurityConfiguration securityConfig;
 
    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        return new OAuth2MethodSecurityExpressionHandler();
    }
}

/*
package com.unit.spring.sponsor.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Sponsor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String division;
    private int grade;
    private LocalDateTime supportingDate;
    private int supportingScale;
    private String company;
    private String department;
    
    @Lob
    private String description;
    private String keyword;
    private String userId;
    private String channel;

    @CreatedDate
    private LocalDateTime createdDate;
    
    public Sponsor() {

    }

    public Sponsor(String division, int grade, LocalDateTime supportingDate, int supportingScale,
        String company, String department, String description, String keyword, String userId, String channel) {
            this.division = division;
            this.grade = grade;
            this.supportingDate = supportingDate;
            this.supportingScale = supportingScale;
            this.company = company;
            this.department = department;
            this.description = description;
            this.keyword = keyword;
            this.userId = userId;
            this.channel = channel;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public LocalDateTime getSupportingDate() {
        return supportingDate;
    }

    public void setSupportingDate(LocalDateTime supportingDate) {
        this.supportingDate = supportingDate;
    }

    public int getSupportingScale() {
        return supportingScale;
    }

    public void setSupportingDate(int supportingScale) {
        this.supportingScale = supportingScale;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
    
}

*/