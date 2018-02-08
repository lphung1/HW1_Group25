package com.example.loiphung.hw01_group25;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.util.*;
import android.content.Intent;
import android.widget.EditText;

public class NewContact extends AppCompatActivity {

    String fname, lname, company, phone, email, url, address, birthday, nickname, fb, twitter, skype, youtube = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);

        setTitle("Create New Contact");

        final EditText fnameText = (EditText) findViewById(R.id.fNameField);
        final EditText lnameText = (EditText) findViewById(R.id.lNameField);
        final EditText companyText = (EditText) findViewById(R.id.companyField);
        final EditText phoneText = (EditText) findViewById(R.id.phoneField);
        final EditText emailText = (EditText) findViewById(R.id.emailField);
        final EditText urlText = (EditText) findViewById(R.id.urlField);
        final EditText addressText = (EditText) findViewById(R.id.addressField);
        final EditText birthdayText = (EditText) findViewById(R.id.birthdayField);
        final EditText nicknameText = (EditText) findViewById(R.id.nicknameField);
        final EditText fbText = (EditText) findViewById(R.id.facebookField);
        final EditText twitterText = (EditText) findViewById(R.id.twitterField);
        final EditText skypeText = (EditText) findViewById(R.id.skypeField);
        final EditText youtubeText = (EditText) findViewById(R.id.youtubeField);


        findViewById(R.id.addPhoto).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            Log.d("Clicked", "Add photo button clicked");
            }
        });



        findViewById(R.id.submitButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                Log.d("Clicked", "Submit clicked");


                finish();
            }
        });


    }
}
