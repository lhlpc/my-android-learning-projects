package com.example.luizhenrique.softblueapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by luizhenrique on 3/4/15.
 */
public class FirstActivity extends Activity {


    //Method called when the activity is created
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout);

    }

    public void onSecondActivity(View view){

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

        startActivity(intent);
    }


}
