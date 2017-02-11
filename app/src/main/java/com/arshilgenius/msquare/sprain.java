package com.arshilgenius.msquare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sprain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprain);
    }
    public void sprain(View view){
        Intent intent = new Intent(getApplicationContext(),sprain.class);
        startActivity(intent);
    }
}
