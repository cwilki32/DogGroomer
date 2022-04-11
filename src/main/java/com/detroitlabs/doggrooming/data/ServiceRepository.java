package com.detroitlabs.doggrooming.data;

import com.detroitlabs.doggrooming.model.GroomingServices;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ServiceRepository {

    private static List<GroomingServices> ALL_SERVICES = Arrays.asList(
            new GroomingServices("Mutt Cutt Makeover", "Includes bath, cut, nail trim, ear cleaning" +
                    "teeth-brushing", 40),
            new GroomingServices("Mutt Cutt Touch-up", "Includes bath, ear cleaning, and nail trim", 25),
            new GroomingServices("Nail Trim", "", 10),
            new GroomingServices("Bath", "", 20),
            new GroomingServices("Ear cleaning", "", 12),
            new GroomingServices("FFF", "face, feet, fanny trim", 15),
            new GroomingServices("Teeth-brushing", "", 10)
    );

    public static List<GroomingServices> getAllServices() {
        return ALL_SERVICES;
    }

    public static void setAllServices(List<GroomingServices> allServices) {
        ALL_SERVICES = allServices;
    }
}
