package com.b2b.bootcamp.service;

import com.b2b.bootcamp.domain.PersonalData;

import java.util.List;

public interface PersonalDataService {
    List<PersonalData> findAll();
    PersonalData findById(Long id);
}
