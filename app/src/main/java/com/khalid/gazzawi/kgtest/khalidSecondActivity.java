package com.khalid.gazzawi.kgtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class khalidSecondActivity extends AppCompatActivity {
    public final static String MESSAGE_KEY="com.khalid.gazzawi.kgtest.MESSAGE_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khalid_second);
        final Intent intent=getIntent();
        String message=intent.getStringExtra(MESSAGE_KEY);
        TextView textView=(TextView) findViewById(R.id.textView);
        textView.setTextSize(45);
        textView.setText(message);
        Button bn=(Button)findViewById(R.id.nxt);
        final Intent intent1=new Intent(this,KThirdActivity.class);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });

    }
    public void mm(View view){
        Intent i =new Intent(this,KThirdActivity.class);
        startActivity(i);

    }

}
