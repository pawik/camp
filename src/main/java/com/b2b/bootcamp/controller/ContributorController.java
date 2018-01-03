package com.b2b.bootcamp.controller;

import com.b2b.bootcamp.domain.Contributor;
import com.b2b.bootcamp.service.ContributorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ContributorController {

    @Autowired
    private ContributorService service;

    @RequestMapping("/lista")
    public ModelAndView findAny(ModelAndView model) {
        List<Contributor> anything = service.findAnything();
        model.setViewName("listOdAnything");
        model.addObject("list", anything);
        return model;
    }

    @RequestMapping("/list")
    public List<Contributor> lista() {
        List<Contributor> anything = service.findAnything();
        return anything;
    }
    @RequestMapping("/listDuplicate")
    public List<Contributor> listaDuplicate() {
        List<Contributor> anything = service.findAnything();
        return anything;
    }
}
