package com.detroitlabs.doggrooming.data;

import com.detroitlabs.doggrooming.model.GroomingServices;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ServiceRepository {

    private static List<GroomingServices> ALL_SERVICES = Arrays.asList(
            new GroomingServices("Mutts Cutts Makeover", "Pets furvorite. Includes bath, cut, nail trim, ear cleaning" +
                    " and teeth-brushing", 40),
            new GroomingServices("Mutts Hangout", "Just let your pup come hang for a bit for tail wagging fun", 30),
            new GroomingServices("Mutts Cutts Touch-up", "Includes fur brushing, ear cleaning, and nail trim", 25),
            new GroomingServices("Nail Trim", "We'll file or grind nails", 10),
            new GroomingServices("Bath", "No more dirty fur", 20),
            new GroomingServices("Ear cleaning", "Hear, hear", 12),
            new GroomingServices("FFF", "Face, feet (paws), fanny trim", 15),
            new GroomingServices("Teeth-cleaning", "Your dogs teeth will be squeaky clean", 10),
            new GroomingServices("Blueberry Facial", "Face Massage, amazing blueberry infused shampoo, conditioner and matching scent spray", 8),
            new GroomingServices("Dye", "Looking fur a switch-up? We offer many different colorful safe options for your pet", 20)
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

    //create a method for description that contains image from image map
    public  List<GroomingServices> resultsContainNails(){
        List<GroomingServices> servicesByNails = new ArrayList<>();
        for (GroomingServices groomingServices: ALL_SERVICES){
            if(groomingServices.getDescription().contains("nail")) {
                servicesByNails.add(groomingServices);
            }
        } return servicesByNails;
    }
    public  List<GroomingServices> resultsContainTeeth(){
        List<GroomingServices> servicesByTeeth = new ArrayList<>();
        for (GroomingServices groomingServices: ALL_SERVICES){
            if(groomingServices.getDescription().contains("teeth")) {
                servicesByTeeth.add(groomingServices);
            }
        } return servicesByTeeth;
    }
    public  List<GroomingServices> resultsContainFace(){
        List<GroomingServices> servicesByFace = new ArrayList<>();
        for (GroomingServices groomingServices: ALL_SERVICES){
            if(groomingServices.getDescription().contains("Face")) {
                servicesByFace.add(groomingServices);
            }
        } return servicesByFace;
    }
    public  List<GroomingServices> resultsContainTail(){
        List<GroomingServices> servicesByTail = new ArrayList<>();
        for (GroomingServices groomingServices: ALL_SERVICES){
            if(groomingServices.getDescription().contains("tail")) {
                servicesByTail.add(groomingServices);
            }
        } return servicesByTail;
    }
    public  List<GroomingServices> resultsContainEars(){
        List<GroomingServices> servicesByEar = new ArrayList<>();
        for (GroomingServices groomingServices: ALL_SERVICES){
            if(groomingServices.getDescription().contains("ear")) {
                servicesByEar.add(groomingServices);
            }
        } return servicesByEar;
    }
    public  List<GroomingServices> resultsContainFur(){
        List<GroomingServices> servicesByFur = new ArrayList<>();
        for (GroomingServices groomingServices: ALL_SERVICES){
            if(groomingServices.getDescription().contains("fur")) {
                servicesByFur.add(groomingServices);
            }
        } return servicesByFur;
    }
}



