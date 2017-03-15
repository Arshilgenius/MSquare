package com.arshilgenius.msquare;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void order(View view){
        Intent intent= new Intent(getApplicationContext(),orderActivity.class);
        startActivity(intent);
    }
    public void BMI(View view){
        Intent intent2= new Intent(getApplicationContext(),BMIActivity.class);
        startActivity(intent2);}

    public void aboutus(View view){
        Intent intent3= new Intent(getApplicationContext(),About_us.class);
        startActivity(intent3);}

    public void depression(View view){
        Intent intent4= new Intent(getApplicationContext(),DepressionActivity.class);
        startActivity(intent4);}

    public void virtualbp(View view){
        Intent intent5= new Intent(getApplicationContext(),virtualbp.class);
        startActivity(intent5);}


}


