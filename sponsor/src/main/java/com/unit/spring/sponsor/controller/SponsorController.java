package com.unit.spring.sponsor.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unit.spring.sponsor.entity.Sponsor;
import com.unit.spring.sponsor.component.SponsorComponent;

@RestController
@CrossOrigin
@RequestMapping("/api/sponsor")
public class SponsorController {
    
    SponsorComponent sponsorComponent;

    @Autowired
    SponsorController(SponsorComponent sponsorComponent) {
        this.sponsorComponent = sponsorComponent;
    }

    @RequestMapping(value="", method=RequestMethod.GET)
    List<Sponsor> getSponsorList() {
        return sponsorComponent.getSponsorList();
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public ResponseEntity<Void> createSponsor(@RequestBody Sponsor sponsor) {
        sponsorComponent.saveSponsor(sponsor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}