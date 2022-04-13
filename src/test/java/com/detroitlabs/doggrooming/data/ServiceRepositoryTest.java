package com.detroitlabs.doggrooming.data;

import com.detroitlabs.doggrooming.model.GroomingServices;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceRepositoryTest {

    @Test   //Pass
    void serviceResults() {
        ServiceRepository serviceRepository = new ServiceRepository();

        List<GroomingServices> result = serviceRepository.serviceResults("nail");

        assertEquals(result.get(0).getServiceName(), "Mutts Cutts Makeover");

    }
    @Test
    void result_Should_Contain_Nails_in_Description() {
        ServiceRepository serviceRepository = new ServiceRepository();

        List<GroomingServices> result = serviceRepository.resultsContainNails();

        for (int i=0; i < result.size(); i++) {
            System.out.println(result.get(i).getServiceName());
        }

        assertEquals(result.get(0).getServiceName(), "Mutts Cutts Makeover");

    }
}
