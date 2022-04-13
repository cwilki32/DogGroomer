package com.detroitlabs.doggrooming.model;

public class GroomingServices {

    String serviceName;
    String description;
    int price;
    String keyword;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public GroomingServices(String serviceName, String description, int price) {
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
    }
}
