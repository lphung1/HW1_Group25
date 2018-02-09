package com.example.loiphung.hw01_group25;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.util.*;
import android.widget.EditText;

public class NewContact extends AppCompatActivity {

    String fname, lname, company, phone, email, url, address, birthday, nickname, fb, twitter, skype, youtube = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);



        setTitle("Create New Contact");

        final EditText fnameText = findViewById(R.id.fNameField);
        final EditText lnameText = findViewById(R.id.lNameField);
        final EditText companyText = findViewById(R.id.companyField);
        final EditText phoneText = findViewById(R.id.phoneField);
        final EditText emailText = findViewById(R.id.emailField);
        final EditText urlText = findViewById(R.id.urlField);
        final EditText addressText = findViewById(R.id.addressField);
        final EditText birthdayText = findViewById(R.id.birthdayField);
        final EditText nicknameText = findViewById(R.id.nicknameField);
        final EditText fbText = findViewById(R.id.facebookField);
        final EditText twitterText = findViewById(R.id.twitterField);
        final EditText skypeText = findViewById(R.id.skypeField);
        final EditText youtubeText = findViewById(R.id.youtubeField);

        final String [] contactFields = new String[13];

        /*
        contactFields[0] = fnameText.getText().toString();
        contactFields[1] = lnameText.getText().toString();
        contactFields[2] = companyText.getText().toString();
        contactFields[3] = phoneText.getText().toString();
        contactFields[4] = emailText.getText().toString();
        contactFields[5] = urlText.getText().toString();
        contactFields[6] = addressText.getText().toString();
        contactFields[7] = birthdayText.getText().toString();
        contactFields[8] = nicknameText.getText().toString();
        contactFields[9] = fbText.getText().toString();
        contactFields[10] = twitterText.getText().toString();
        contactFields[11] = skypeText.getText().toString();
        contactFields[12] = youtubeText.getText().toString();
        */






        /*
        Add photo button
         */
        findViewById(R.id.addPhoto).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            Log.d("Clicked", "Add photo button clicked");
            }
        });


        /*
        submit button
         */
        findViewById(R.id.submitButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Clicked", "Submit clicked");

                Contact c = new Contact(fnameText.getText().toString(),
                        lnameText.getText().toString(),
                        companyText.getText().toString(),
                        phoneText.getText().toString(),
                        emailText.getText().toString(),
                        urlText.getText().toString(),
                        addressText.getText().toString(),
                        birthdayText.getText().toString(),
                        nicknameText.getText().toString(),
                        fbText.getText().toString(),
                        twitterText.getText().toString(),
                        skypeText.getText().toString(),
                        youtubeText.getText().toString()
                );

                MainActivity.contactArrayList.add(c);

                Log.d("Contact", "" + c.getFirstLastName() + c.getLname() + c.getCompany());

                //Log.d("Array content", "First and last name: " + (fnameText.getText().toString()) + contactFields[1]);

                finish();
            }
        });


    }
}
