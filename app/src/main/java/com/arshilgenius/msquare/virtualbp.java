package com.arshilgenius.msquare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
       if(upper>160){
           TextView t = (TextView) findViewById(R.id.virtualbptv);
           t.setText("Stage 2 Hypertension");
       }
        else if(upper>140){
            TextView t = (TextView) findViewById(R.id.virtualbptv);
            t.setText("Stage 1 Hypertension");
        }
       else if(upper>120){
           TextView t = (TextView) findViewById(R.id.virtualbptv);
           t.setText("PreHypertension");
       }
       else if(upper<=120){
           TextView t = (TextView) findViewById(R.id.virtualbptv);
           t.setText("Normal");
       }
       else if(upper<100){
           TextView t = (TextView) findViewById(R.id.virtualbptv);
           t.setText("Low BP");
       }

    }

}