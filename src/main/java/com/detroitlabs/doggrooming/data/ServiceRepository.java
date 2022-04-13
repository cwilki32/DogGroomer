package com.detroitlabs.doggrooming.data;

import com.detroitlabs.doggrooming.model.GroomingServices;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ServiceRepository {

    private static List<GroomingServices> ALL_SERVICES = Arrays.asList(
            new GroomingServices("Mutts Cutts Makeover", "Includes bath, cut, nail trim, ear cleaning" +
                    "teeth-brushing", 40),
            new GroomingServices("Mutts Hangout", "Let your pup come hang for a bit", 30),
            new GroomingServices("Mutts Cutts Touch-up", "Includes bath, ear cleaning, and nail trim", 25),
            new GroomingServices("Nail Trim", "We'll file or grind", 10),
            new GroomingServices("Bath", "", 20),
            new GroomingServices("Ear cleaning", "", 12),
            new GroomingServices("FFF", "face, feet, fanny trim", 15),
            new GroomingServices("Teeth-brushing", "", 10),
            new GroomingServices("Blueberry Facial", "Amazing blueberry infused shampoo, conditioner and matching scent spray", 8),
            new GroomingServices("Dye", "Looking for a switch-up? We offer many different colorful safe options for your pet", 20)
    );

    public static List<GroomingServices> getAllServices() {
        return ALL_SERVICES;
    }

    public static void setAllServices(List<GroomingServices> allServices) {
        ALL_SERVICES = allServices;
    }

    public List<GroomingServices> serviceResults(String keyword){
        List<GroomingServices> servicesByKeyword = new ArrayList<>();
        for(GroomingServices groomingServices: ALL_SERVICES){
            if (groomingServices.getDescription().contains(keyword)){
                servicesByKeyword.add(groomingServices);
            }
        }return servicesByKeyword;
    }
}
