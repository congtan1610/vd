package com.example.danhmuc;

import android.graphics.Color;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by webmaster@dotnet.vn on 10/11/2017.
 */
public class MainActivity extends AppCompatActivity {
    private ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView) findViewById(R.id.lvContact);
        ArrayList<Contact> arrContact = new ArrayList<>();

        arrContact.add(new Contact("Iphone 13","$999",R.drawable.a));
        arrContact.add(new Contact("Iphone 13","$999",R.drawable.b));
        arrContact.add(new Contact("Iphone 13","$999",R.drawable.c));
        arrContact.add(new Contact("Iphone 13","$999",R.drawable.d));
        arrContact.add(new Contact("Iphone 13","$999",R.drawable.e));
        arrContact.add(new Contact("Iphone 13","$999",R.drawable.f));
        arrContact.add(new Contact("Iphone 13","$999",R.drawable.g));

        DMAdapter customAdaper = new DMAdapter(this,R.layout.dong_dm,arrContact);
        lvContact.setAdapter(customAdaper);
    }
}
