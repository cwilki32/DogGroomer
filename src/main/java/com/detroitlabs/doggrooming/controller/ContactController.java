package com.detroitlabs.doggrooming.controller;

import com.detroitlabs.doggrooming.data.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

    @Autowired
    private CompanyRepository companyRepository;

    @RequestMapping("/contact")
    public String displayContact(ModelMap modelMap) {
        modelMap.put("company", companyRepository.getCompanyInfo());
        return "contact";
    }



}
