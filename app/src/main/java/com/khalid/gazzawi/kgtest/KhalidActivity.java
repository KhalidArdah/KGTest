package com.khalid.gazzawi.kgtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Khalid on 8/7/16.
 */
public class KhalidActivity extends Activity{
    public final static String MESSAGE_KEY="com.khalid.gazzawi.kgtest.MESSAGE_KEY";
    EditText message_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.khalid_layout);
        message_text=(EditText)findViewById(R.id.msg);
    }
    public void send_msg(View view){
        Intent intent=new Intent(this,khalidSecondActivity.class);
        String s=message_text.getText().toString();
        intent.putExtra(MESSAGE_KEY,s);
        startActivity(intent);
    }
}
