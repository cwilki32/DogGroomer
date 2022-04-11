package com.detroitlabs.doggrooming.model;

public class Dog {

    private String url;
    private Breeds breeds[];


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Breeds[] getBreeds() {
        return breeds;
    }

    public void setBreeds(Breeds[] breeds) {
        this.breeds = breeds;
    }
}
