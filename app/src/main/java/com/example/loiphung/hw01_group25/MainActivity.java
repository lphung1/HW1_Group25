package com.example.loiphung.hw01_group25;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.util.*;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    public static ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Contacts");

        findViewById(R.id.createNewButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this , NewContact.class);
                startActivity(i);
                Log.d("Clicked", "Create contact button clicked");


            }
        });

        findViewById(R.id.editButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Log.d("Clicked", "Edit button clicked");

            }
        });







    }
}
