package com.example.loiphung.hw01_group25;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisplayContacts extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_contacts);
        setTitle("Contacts List");
        ListView lv = findViewById(R.id.listView);
        //CustomAdapter adapter = new CustomAdapter(this, R.layout.item_row, MainActivity.contactArrayList);

        ArrayAdapter arrayAdapter = new ArrayAdapter ( DisplayContacts.this, R.layout.item_row , MainActivity.contactArrayList);
        lv.setAdapter(arrayAdapter);



       // lv.setAdapter(adapter);


    }
}
