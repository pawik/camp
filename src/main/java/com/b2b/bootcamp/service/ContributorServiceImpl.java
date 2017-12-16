package com.b2b.bootcamp.service;

import com.b2b.bootcamp.dao.ContributorDao;
import com.b2b.bootcamp.domain.Contributor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContributorServiceImpl implements ContributorService {

    @Autowired
    private ContributorDao dao;

    public List<Contributor> findAll() {
        return (List<Contributor>) dao.findAll();
    }

    public Contributor findById(Long id) {
        return dao.findOne(id);
    }

    @Override
    public List<Contributor> findAnything() {
        return dao.findAnythign();
    }
}
