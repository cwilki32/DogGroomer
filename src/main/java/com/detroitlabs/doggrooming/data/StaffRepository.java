package com.detroitlabs.doggrooming.data;

import com.detroitlabs.doggrooming.model.Staff;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StaffRepository {

    private static final List <Staff> staffMembers = Arrays.asList(
            new Staff("Elissa Olivas", "elissa", "Elissa has been a dog groomer for 6 years. She specializes " +
                    "in trending cuts and classic styles. Her love for all animals is felt by both customers and their pets!"),
            new Staff("Amanda Vollmar", "amanda", "Amanda has been grooming for 7 years and has been with Mutt Cutts " +
                    "for 3 years. Her knowledge comes from a personal experience with different breeds and styles. We are always interested " +
                    "to see the next project she finds herself in!"),
            new Staff("Collin Wilkins", "collin", "Collin has been a dog lover his whole life and has been " +
                    " with Mutt Cutts since 2016! We like to refer to him as our very own Dog whisperer and his specialties seem to have no end! ")
    );
    public List<Staff> getAllStaffMembers() {
        return staffMembers;
    }

}
