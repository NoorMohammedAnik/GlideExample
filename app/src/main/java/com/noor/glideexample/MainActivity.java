package com.noor.glideexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize ImageView
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        //Loading image from url into imageView
        Glide.with(this)
                .load("http://www.cse.com.bd/ipo_index.png")
                .placeholder(R.drawable.loading)
                .error(R.drawable.not_found)
                .into(imageView);

    }
}
