package com.unit.spring.sponsor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unit.spring.sponsor.entity.Sponsor;

public interface SponsorRepository extends JpaRepository<Sponsor, Long> {}
