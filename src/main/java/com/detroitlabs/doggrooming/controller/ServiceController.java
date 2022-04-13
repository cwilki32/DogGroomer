package com.detroitlabs.doggrooming.controller;


import com.detroitlabs.doggrooming.data.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceController { //handles methods for the contains/image map

    @Autowired
    ServiceRepository serviceRepository;


    @RequestMapping("/face")
    public String displayFaceServices(ModelMap modelMap) {
        modelMap.put("services", serviceRepository.resultsContainFace());
        return "/service-results-contains-face";
    }

    @RequestMapping("/tail")
    public String displayTailServices(ModelMap modelMap) {
        modelMap.put("services", serviceRepository.resultsContainTail());
        return "service-results-contain-tail";
    }

    @RequestMapping("/ears")
    public String displayEarServices(ModelMap modelMap) {
        modelMap.put("services", serviceRepository.resultsContainEars());
        return "service-results-contains-ears";
    }

    @RequestMapping("/teeth")
    public String displayTeethServices(ModelMap modelMap) {
        modelMap.put("services", serviceRepository.resultsContainTeeth());
        return "service-results-contains-teeth";
    }

    @RequestMapping("/paws")
    public String displayPawServices(ModelMap modelMap) {
        modelMap.put("services", serviceRepository.resultsContainNails());
        return "service-results-contains-paws";
    }
    @RequestMapping("/fur")
    public String displayFurServices(ModelMap modelMap) {
        modelMap.put("services", serviceRepository.resultsContainFur());
        return "service-results-contains-fur";
    }

}
