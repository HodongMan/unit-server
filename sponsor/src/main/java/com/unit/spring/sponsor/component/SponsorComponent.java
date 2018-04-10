package com.unit.spring.sponsor.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.unit.spring.sponsor.entity.Sponsor;
import com.unit.spring.sponsor.repository.SponsorRepository;

@Component
public class SponsorComponent {
    
    @Autowired
    SponsorRepository sponsorRepository;

    @Autowired
    public SponsorComponent(SponsorRepository sponsorRepository) {
        this.sponsorRepository = sponsorRepository;
    }

    public Sponsor getSponsor(long id) {
        return sponsorRepository.findById(id).get();
    }

    public List<Sponsor> getSponsorList() {
        return sponsorRepository.findAll();
    }

    public void saveSponsor(Sponsor sponsor) {
        sponsorRepository.save(sponsor);
    }
}