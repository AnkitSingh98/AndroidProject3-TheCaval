package com.ankithacks.thecaval;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    public  void login(View v)
    {
        Intent i=new Intent(this,OffersAndNotifications.class);
        startActivity(i);
    }

    public  void signUp(View v)
    {
        Intent i=new Intent(this,signup.class);
        startActivity(i);
    }
}
