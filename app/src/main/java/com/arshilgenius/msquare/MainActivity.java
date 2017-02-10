package com.arshilgenius.msquare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void order(View view){
        Intent intent= new Intent(getApplicationContext(),orderActivity.class);
        startActivity(intent);
    }
    public void BMI(View view){
        Intent intent2= new Intent(getApplicationContext(),BMI.class);
        startActivity(intent2);}

    public void aboutus(View view){
        Intent intent3= new Intent(getApplicationContext(),BMI.class);
        startActivity(intent3);}

    public void depression(View view){
        Intent intent4= new Intent(getApplicationContext(),Depression.class);
        startActivity(intent4);}

    public void virtualbp(View view){
        Intent intent5= new Intent(getApplicationContext(),virtualbp.class);
        startActivity(intent5);}

}
