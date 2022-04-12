package com.detroitlabs.doggrooming.controller;

import com.detroitlabs.doggrooming.data.CompanyRepository;
import com.detroitlabs.doggrooming.data.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    ServiceRepository serviceRepository;
    //home
    //meet the staff
    //services
    //reviews
    //faq
    //contact
    //book appt
    @RequestMapping("/")
    public String displayHomePage() {
        return "home";
    }

    @RequestMapping("/staff")
    public String displayStaff() {
        return "staff";
    }

    @RequestMapping("/services")
    public String displayServices(ModelMap modelMap) {
        modelMap.put("services", ServiceRepository.getAllServices());
        return "services";
    }

    @RequestMapping("/reviews")
    public String displayReviews() {
        return "reviews";
    }
    @RequestMapping("/faq")
    public String displayFAQ() {
        return "faq";
    }
    @RequestMapping("/contact")
    public String displayContact(ModelMap modelMap) {
        modelMap.put("company", companyRepository.getCompanyInfo());
        return "contact";
    }
    @RequestMapping("/schedule")
    public String displaySchedule() {
        return "schedule";
    }
}
