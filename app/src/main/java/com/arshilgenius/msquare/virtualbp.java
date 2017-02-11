package com.arshilgenius.msquare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class virtualbp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtualbp);
    }
    public void bpmeasure(View view){
         EditText e = (EditText) findViewById(R.id.up);
        int upper = Integer.parseInt(e.getText().toString());
        EditText e2 = (EditText) findViewById(R.id.down);
        int down = Integer.parseInt(e2.getText().toString());


    }

}