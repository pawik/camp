package com.b2b.bootcamp.dao;

import com.b2b.bootcamp.domain.PersonalData;
import org.springframework.data.repository.CrudRepository;

public interface PersonalDataDao extends CrudRepository<PersonalData, Long> {
}
