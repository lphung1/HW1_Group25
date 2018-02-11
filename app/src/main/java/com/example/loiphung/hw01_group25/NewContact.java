package com.example.loiphung.hw01_group25;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.util.*;
import android.widget.EditText;
import android.widget.Toast;

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

                if(fnameText.getText().toString().isEmpty() || lnameText.getText().toString().isEmpty() || phoneText.getText().toString().isEmpty()  ){

                    Toast fieldsRequired = Toast.makeText(NewContact.this, "First name, Last name, and Phone number is required", Toast.LENGTH_SHORT);
                    fieldsRequired.show();
                    fieldsRequired.setGravity(Gravity.CENTER, 0, 0);
                    Log.d("fname Contains: ", "" + fnameText.getText().toString().isEmpty() + fnameText.getText().toString());
                    Log.d("lname Contains: ", "" + lnameText.getText().toString().isEmpty() + lnameText.getText().toString());
                    Log.d("phone Contains: ", "" + phoneText.getText().toString().isEmpty() + phoneText.getText().toString());

                }
                else {
                    Contact c = new Contact(R.id.contactImageView,
                            fnameText.getText().toString(),
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
                    Log.d("ArrayContent", "MainActivity.contactArrayList" + MainActivity.contactArrayList);

                    finish();
                }

            }
        });


    }
}
