package com.detroitlabs.doggrooming.data;


import com.detroitlabs.doggrooming.model.Company;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyRepository {

    private Company companyInfo = new Company("Mutts Cutts", "719-123-4567", "contact_mutts@muttcutts.com", "404 Shears Dr Colorado Springs, CO 80910");


    public Company getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(Company companyInfo) {
        this.companyInfo = companyInfo;
    }
}
