package com.khalid.gazzawi.kgtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showSecondActivity(View view){
        String t=((Button)view).getText().toString();
        Intent intent=new Intent();
        switch (t)
        {
            case "Gazzawi Activity":
                intent.setClass(this,GazzawiActivity.class);
                startActivity(intent);
                break;
            case "Khalid Activity":
                intent.setClass(this,KhalidActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
