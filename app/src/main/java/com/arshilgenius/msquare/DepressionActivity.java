package com.arshilgenius.msquare;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DepressionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression);
    }  public void burns(View view){
        Intent intent = new Intent(getApplicationContext(),Burns.class);
        startActivity(intent);
    }
    public void fainting(View view){
        Intent intent = new Intent(getApplicationContext(),fainting.class);
        startActivity(intent);
    }
    public void fracture(View view){
        Intent intent2 = new Intent(getApplicationContext(),fracture.class);
        startActivity(intent2);
    }
    public void heartattack(View view){
        Intent intent3 = new Intent(getApplicationContext(),heartattack.class);
        startActivity(intent3);
    }

    public void sprain(View view){
        Intent intent5 = new Intent(getApplicationContext(),sprain.class);
        startActivity(intent5);
    }

    }


