package com.example.loiphung.hw01_group25;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Loi on 2/10/2018.
 */

public class CustomAdapter extends ArrayAdapter {

        Context context;
        int layoutResourceId;
        ArrayList<Contact> contact = null;


        public CustomAdapter(Context context, int resource, ArrayList<Contact> object){
            super(context, resource, object);

            this.layoutResourceId = resource;
            this.context = context;
            this.contact = object;

        }


        static class DataHolder{
            ImageView ivContactImage;
            TextView tvContactEntryView;
        }



        @NonNull
        @Override
        public View getView(int position,  View convertView,  ViewGroup parent) {

            DataHolder holder = null;

            if (convertView==null){ //fills data

                LayoutInflater inflater = ((Activity)context).getLayoutInflater();
                convertView = inflater.inflate(layoutResourceId, parent);

                holder = new DataHolder();

                holder.ivContactImage = (ImageView)convertView.findViewById(R.id.contactImageView);
                holder.tvContactEntryView = (TextView)convertView.findViewById(R.id.firstLastPhoneView);

                convertView.setTag(holder);
            }
            else{ //converts the view once data is entered.

                holder = (DataHolder)convertView.getTag();

            }

            //Contact c = contact.get(position);
            Contact c = contact.get(position);
             //image resource
            holder.tvContactEntryView.setText(c.getFirstLastName());
            holder.ivContactImage.setImageResource(c.getImageID());
            return convertView;

        }
}
