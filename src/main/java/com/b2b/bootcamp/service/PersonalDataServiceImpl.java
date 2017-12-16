package com.b2b.bootcamp.service;

import com.b2b.bootcamp.dao.PersonalDataDao;
import com.b2b.bootcamp.domain.PersonalData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalDataServiceImpl implements PersonalDataService {

    @Autowired
    private PersonalDataDao dao;

    public List<PersonalData> findAll() {
        return (List<PersonalData>) dao.findAll();
    }

    public PersonalData findById(Long id) {
        return dao.findOne(id);
    }
}
