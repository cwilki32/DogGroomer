package com.detroitlabs.doggrooming.service;


import com.detroitlabs.doggrooming.model.Dog;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DogService {

    public static Dog[] fetchDog() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.thedogapi.com/v1/images/search?size=med&mime_types=jpg&format=json&has_breeds=true&order=RANDOM&page=0&limit=1",
                Dog[].class);

    }
}
