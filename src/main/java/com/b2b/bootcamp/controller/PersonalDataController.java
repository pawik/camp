package com.b2b.bootcamp.controller;

import com.b2b.bootcamp.domain.PersonalData;
import com.b2b.bootcamp.service.PersonalDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/personalData")
@Controller
public class PersonalDataController {

    @Autowired
    private PersonalDataServiceImpl service;

    @RequestMapping("/findAll")
    public List<PersonalData> data() {
        return (List<PersonalData>) service.findAll();
    }

    @RequestMapping("/find")
    public PersonalData findById(Long id) {
        return service.findById(id);
    }
}
