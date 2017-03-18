package com.example.lenovo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.squareup.picasso.Picasso;
/**
 * Created by Lenovo on 3/16/2017.
 */

public class Details extends AppCompatActivity {

android.support.v7.widget.Toolbar t;

    TextView desc, id,price;
    ImageView imageView;

    //ProductDescription , price , image,id



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalis);


        desc = (TextView) findViewById(R.id.text_desc);
        imageView = (ImageView) findViewById(R.id.image_news);
        price = (TextView) findViewById(R.id.text_price);
        Intent intent = getIntent();



        desc.setText(intent.getStringExtra("productDescription"));

        desc.setTextSize(20);
        price.setText(intent.getStringExtra("price"));
        Picasso.with(getApplicationContext()).load(intent.getStringExtra("image")).resize(800,500).into(imageView);


    }

}
