package com.khalid.gazzawi.kgtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class khalidSecondActivity extends AppCompatActivity {
    public final static String MESSAGE_KEY="com.khalid.gazzawi.kgtest.MESSAGE_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_khalid_second);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MESSAGE_KEY);
        TextView textView=new TextView(this);
        textView.setTextSize(45);
        textView.setText(message);
        setContentView(textView);
    }
}
