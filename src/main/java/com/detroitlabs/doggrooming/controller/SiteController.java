package com.detroitlabs.doggrooming.controller;

import com.detroitlabs.doggrooming.data.CompanyRepository;
import com.detroitlabs.doggrooming.data.ServiceRepository;
import com.detroitlabs.doggrooming.data.StaffRepository;
import com.detroitlabs.doggrooming.model.Dog;
import com.detroitlabs.doggrooming.model.GroomingServices;
import com.detroitlabs.doggrooming.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SiteController {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    ServiceRepository serviceRepository;

    @Autowired
    StaffRepository staffRepository;
    //home
    //meet the staff
    //services
    //reviews
    //faq
    //contact
    //book appt
    @RequestMapping("/")
    public String displayHomePage(ModelMap modelMap) {
        Dog[] dogPic = DogService.fetchDog();
        modelMap.put("dogPhoto1", dogPic[0].getUrl());
        modelMap.put("dogPhoto2", dogPic[1].getUrl());
        modelMap.put("dogPhoto3", dogPic[2].getUrl());
        modelMap.put("dogPhoto4", dogPic[3].getUrl());
        modelMap.put("dogPhoto5", dogPic[4].getUrl());
        modelMap.put("company", companyRepository.getCompanyInfo());
        return "home";
    }

    @RequestMapping("/staff")
    public String displayStaff(ModelMap modelMap) {
        modelMap.put("staff", staffRepository.getAllStaffMembers());
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


    @RequestMapping("/gallery")
    public String displayGallery() {
        return "gallery";
    }

    @RequestMapping("/shopping-cart")
    public String displayCart(){
        return "shopping-cart";
    }
}
