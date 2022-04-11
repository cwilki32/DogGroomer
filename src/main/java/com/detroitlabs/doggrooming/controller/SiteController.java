package com.detroitlabs.doggrooming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

    @RequestMapping("/")
    public String displayHomePage() {
        return "home";
    }
}
