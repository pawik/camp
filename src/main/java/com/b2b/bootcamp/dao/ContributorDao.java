package com.b2b.bootcamp.dao;

import com.b2b.bootcamp.domain.Contributor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContributorDao extends CrudRepository<Contributor, Long> {

    @Query(value = "select c from Contributor c left join c.reservation")
    List<Contributor> findAnythign();
}
