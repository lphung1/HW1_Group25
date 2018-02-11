package com.example.loiphung.hw01_group25;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    public static final String CONTACT_ARRAY_LIST_KEY = "arraylist";
    public static final String CONTACT_OBJECT = "somecontacts";
    public static final String CONTACT_FIELDS_ARRAY = "contacts";

    public static ArrayList<Contact> contactArrayList = new ArrayList<Contact>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Contacts");
        contactArrayList.add(new Contact("John", "Doe", "0000000000"));
        contactArrayList.add(new Contact("Sam", "Smith", "1234567890"));
        contactArrayList.add(new Contact("Elon", "Musk", "9876543210"));

        //Create new contact button
        findViewById(R.id.createNewButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this , NewContact.class);
                i.putExtra(CONTACT_ARRAY_LIST_KEY, contactArrayList);
                Log.d("Clicked", "Create contact button clicked");
                startActivity(i);

            }
        });

        //edit button
        findViewById(R.id.editButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Log.d("Clicked", "Edit button clicked");

            }
        });

        //display contact button
        findViewById(R.id.displayButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Log.d("Clicked", "display button clicked");
                Intent i = new Intent(MainActivity.this , DisplayContacts.class);
                startActivity(i);


            }
        });

        findViewById(R.id.finishButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Log.d("Clicked", "display button clicked");
                Intent i = new Intent();
                finish();
            }
        });




    }

}
