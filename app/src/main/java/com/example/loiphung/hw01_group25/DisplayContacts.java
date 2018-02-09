package com.example.loiphung.hw01_group25;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class DisplayContacts extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contacts);
        setTitle("Contacts List");
        lv = (ListView) findViewById(R.id.contactListView);


        ArrayAdapter arrayAdapter = new ArrayAdapter ( DisplayContacts.this, android.R.layout.simple_list_item_1 , MainActivity.contactArrayList);

        lv.setAdapter(arrayAdapter);

    }
}
