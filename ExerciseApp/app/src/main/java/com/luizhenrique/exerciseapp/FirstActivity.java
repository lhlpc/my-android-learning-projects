package com.luizhenrique.exerciseapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class FirstActivity extends ActionBarActivity {

    private static final String TAG = "App";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.d(TAG, "OnCreate");

    }


    public void nextActivity(View view){

        EditText editText = (EditText) findViewById(R.id.txtFirstMessage);

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message", editText.getText().toString());

        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == 1 && resultCode==RESULT_OK){
            String message = data.getStringExtra("messageBack");

            findViewById(R.id.btnFirstActivity).setEnabled(false);
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "OnStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "OnStart");
    }
}
