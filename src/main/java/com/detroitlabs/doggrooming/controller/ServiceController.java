package com.detroitlabs.doggrooming.controller;

import com.detroitlabs.doggrooming.data.ServiceRepository;
import com.detroitlabs.doggrooming.model.GroomingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ServiceController {

    @Autowired
    ServiceRepository serviceRepository;

    @RequestMapping("/services")
    public String displayServices(ModelMap modelMap) {
        modelMap.put("services", ServiceRepository.getAllServices());
        return "services";
    }
}
