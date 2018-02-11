package com.example.loiphung.hw01_group25;

import android.widget.ArrayAdapter;
import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.text.*;

/**
 * Created by LoiPhung on 2/8/18.
 *
 */

public class Contact implements Serializable{

    String [] contact;
    String fname, lname, company, phone, email, url, address, birthday, nickname, fb, twitter, skype, youtube = null;
    int imageID;
    public static final DecimalFormat phoneFormatD = new DecimalFormat("0000000000");
    public static final MessageFormat phoneFormatM = new MessageFormat("({0}) {1}-{2}");

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

        return (getFirstLastName() + "\n" + this.formatPhoneNumber(phone));
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

    /**
     * Method Created by Yamil Garcia Hernandez on 25/4/16.
     * Stack overflow on formatting phone number
     */
    private static String formatPhoneNumber(Object phone){
        double p = 0;
        if (phone instanceof String)
            p = Double.valueOf((String) phone);
        if (phone instanceof Integer)
            p = (Integer) phone;
        if (phone instanceof Float)
            p = (Float) phone;
        if (phone instanceof Double)
            p = (Double) phone;
        String fot = phoneFormatD.format(p);

        String extra = fot.length() > 10 ? fot.substring(0, fot.length() - 10) : "";
        fot = fot.length() > 10 ? fot.substring(fot.length() - 10, fot.length()) : fot;

        String[] arr = {
                (fot.charAt(0) != '0') ? fot.substring(0, 3) : (fot.charAt(1) != '0') ? fot.substring(1, 3) : fot.substring(2, 3),
                fot.substring(3, 6),
                fot.substring(6)
        };
        String r = phoneFormatM.format(arr);
        r = (r.contains("(0)")) ? r.replace("(0) ", "") : r;
        r = (extra != "") ? ("+" + extra + " " + r) : r;
        return (r);
    }


}


