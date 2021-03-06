package com.example.loiphung.hw01_group25;

import android.widget.ArrayAdapter;
import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LoiPhung on 2/8/18.
 * Test for git changes
 */

public class Contact implements Serializable{

    String [] contact;
    String fname, lname, company, phone, email, url, address, birthday, nickname, fb, twitter, skype, youtube = null;
    int imageID;

    public Contact(String[] contact) {
        this.contact = contact;
    }

    public Contact(int image, String fname, String lname, String company, String phone, String email, String url, String address, String birthday, String nickname, String fb, String twitter, String skype, String youtube) {
        this.fname = fname;
        this.lname = lname;
        this.company = company;
        this.phone = phone;
        this.email = email;
        this.url = url;
        this.address = address;
        this.birthday = birthday;
        this.nickname = nickname;
        this.fb = fb;
        this.twitter = twitter;
        this.skype = skype;
        this.youtube = youtube;
        this.imageID = image;
    }

    @Override
    public String toString() {

        return (getFirstLastName() + "\n" + getPhone());
    }

    public String getFirstLastName(){
        return (fname + " " + lname);
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getCompany() {
        return company;
    }

    public String getPhone() {

        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getUrl() {
        return url;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public String getFb() {
        return fb;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getSkype() {
        return skype;
    }

    public String getYoutube() {
        return youtube;
    }

    public int getImageID() {
        return imageID;
    }

}


