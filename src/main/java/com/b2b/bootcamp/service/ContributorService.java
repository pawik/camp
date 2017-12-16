package com.b2b.bootcamp.service;

import com.b2b.bootcamp.domain.Contributor;

import java.util.List;

public interface ContributorService {
    List<Contributor> findAll();
    Contributor findById(Long id);
    List<Contributor> findAnything();
}
