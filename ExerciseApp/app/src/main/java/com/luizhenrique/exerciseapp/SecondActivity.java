package com.luizhenrique.exerciseapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.microedition.khronos.egl.EGLDisplay;


public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String firstMessage = getIntent().getStringExtra("message");

        TextView textView = (TextView) findViewById(R.id.txtFirstAnswer);

        textView.setText(firstMessage);
    }

    public void comeBack(View view){

        EditText editText = (EditText) findViewById(R.id.txtSecondAnswer);

        Intent intent = new Intent();

        intent.putExtra("messageBack", editText.getText().toString() );

        setResult(RESULT_OK, intent);
        finish();
    }




}
