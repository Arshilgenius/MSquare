package com.arshilgenius.msquare;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



    public class orderActivity extends AppCompatActivity {
        int orderValue = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_order);
        }
    public void increment(View v) {
        orderValue = orderValue + 1;
        if (orderValue >= 100)
            orderValue = 100;
        Toast.makeText(this, "No of Medicine cannot be more than 100", Toast.LENGTH_SHORT).show();
        displayno(orderValue);
    }

    public void decrement(View v) {
        orderValue = orderValue - 1;
        if (orderValue <= 0) {
            Toast.makeText(this, "No of Medicine cannot be less than 0", Toast.LENGTH_SHORT).show();
            orderValue = 0;
        }
        displayno(orderValue);

    }

    public String orderSummary(int xxxy, boolean xyz, boolean xyzz, String xxyy) {


        String order = "Medicine Name : " + xxyy;
        order += "\n Quantity :  " + orderValue;
        order += "\n Price of COD : " + xxxy;
        order += "\n Cash on Delivery  " + xyz;
        order += "\n Debit Card  " + xyzz;
        order += "\n Thank You!";
        return order;
    }

    public int calculatePrice(Boolean a, Boolean b) {
        int pricecalulated = 0;

        if (a == true)
            pricecalulated += 100;
        if (b == true)
            pricecalulated += 0;
        return pricecalulated * orderValue;

    }

    public void displayPrice(View v) {

        CheckBox check = (CheckBox) findViewById(R.id.checkbox);
        Boolean haschecked = check.isChecked();
        CheckBox checktwo = (CheckBox) findViewById(R.id.checkboxtwo);
        Boolean hascheckedtwo = checktwo.isChecked();
        EditText text = (EditText) findViewById(R.id.textfield);
        String textvalue = text.getText().toString();
        int price = calculatePrice(haschecked, hascheckedtwo);
        String priceMessage = orderSummary(price, haschecked, hascheckedtwo, textvalue);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Medicine Ordered: " + textvalue);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }

    public void displayno(int hey) {
        TextView textview = (TextView) findViewById(R.id.no);
        textview.setText(String.valueOf(hey));
    }

}