package com.detroitlabs.doggrooming.model;

public class Staff {
    private String name;
    private String imageID;
    private String bio;

    public Staff(String name, String imageID, String bio) {
        this.name = name;
        this.imageID = imageID;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
