package com.arshilgenius.msquare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }

    public void bmiCalculate(View view){

        EditText wt = (EditText) findViewById(R.id.wt) ;

        double wt1 = Double.parseDouble( wt.getText().toString() );
        if(wt1==0){
            TextView v = (TextView) findViewById(R.id.bmitv);
            v.setText("Enter Something");
        }
        EditText ht = (EditText) findViewById(R.id.ht) ;

        double ht1 = Double.parseDouble( ht.getText().toString() );

        if(ht1==0){
            TextView v = (TextView) findViewById(R.id.bmitv);
            v.setText("Enter Something");
        }
        double bmi=wt1/(ht1*ht1);
        if(bmi<16){
            TextView v = (TextView) findViewById(R.id.bmitv);
            v.setText("Severly UnderWeight");
        }
        else if (bmi < 18.5) {

            TextView v = (TextView) findViewById(R.id.bmitv);
            v.setText("UnderWeight");        }
        else if (bmi < 25) {
            TextView v = (TextView) findViewById(R.id.bmitv);
            v.setText("Normal");


        } else if (bmi==0) {
            TextView v = (TextView) findViewById(R.id.bmitv);
            v.setText("Enter Something");}
        else if (bmi < 30) {
            TextView v = (TextView) findViewById(R.id.bmitv);
            v.setText("OverWeight");

        } else {
            TextView v = (TextView) findViewById(R.id.bmitv);
            v.setText("Obese");
        }

    }


}
