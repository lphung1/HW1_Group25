package com.example.loiphung.hw01_group25;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DisplayContacts extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_contacts);
        setTitle("Contacts List");
        ListView lv = findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter();
        lv.setAdapter(customAdapter);



    }

    public class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {

            return MainActivity.contactArrayList.size();

        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.item_row, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.contactImageView);
            TextView textView = (TextView) view.findViewById(R.id.firstLastPhoneView);

            imageView.setImageResource(R.drawable.default_image);
            textView.setText(MainActivity.contactArrayList.get(i).toString());
            Log.d("CustomAdapter Count: ", "" + getCount());
            Log.d("Position ", "" + i);

            return view;
        }

    }

}
