package com.facebookintegration;

import java.io.Serializable;

/**
 * Created by avinash
 */

public class FacebookUser implements Serializable{

    private String name;
    private String email;
    private String fbID;
    private String profilePicUrl;

    public String getProfilePicUrl() {
        return "https://graph.facebook.com/" + getFbID() + "/picture?type=large&redirect=true&width=600&height=600";
    }

    public String getFbID() {
        return fbID;
    }

    public void setFbID(String fbID) {
        this.fbID = fbID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
