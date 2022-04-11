package com.detroitlabs.doggrooming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

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
//    @RequestMapping("/services")
//    public String displayServices() {
//        return "services";
//    }
    @RequestMapping("/reviews")
    public String displayReviews() {
        return "reviews";
    }
    @RequestMapping("/faq")
    public String displayFAQ() {
        return "faq";
    }
    @RequestMapping("/contact")
    public String displayContact() {
        return "contact";
    }
    @RequestMapping("/schedule")
    public String displaySchedule() {
        return "schedule";
    }
}
