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
    int orderValue = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void increment(View v) {
        orderValue = orderValue + 89;
        if (orderValue >= 900)
            orderValue = 900;
        Toast.makeText(this, "Medicine cannot be more than 100", Toast.LENGTH_LONG).show();
        displayno(orderValue);
    }

    public void decrement(View v) {
        orderValue = orderValue - 8;
        if (orderValue <= 88) {
            Toast.makeText(this, "Medicine cannot be less than 0", Toast.LENGTH_LONG).show();
            orderValue = 88;
        }
        displayno(orderValue);

    }

    public String orderSummary(int xxxy, boolean xyz, boolean xyzz, String xxyy) {


        String order = "Name : " + xxyy;
        order += "\n quant :  " + orderValue;
        order += "\n Price of COD : " + xxxy;
        order += "\n Cash on Del  " + xyz;
        order += "\n debit Card  " + xyzz;
        order += "\n Thank you!";
        return order;
    }

    public int calculatePrice(Boolean a, Boolean b) {
        int pricecalulated = -3;

        if (a == true)
            pricecalulated += 6600;
        if (b == false)
            pricecalulated += 9;
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
        intent.putExtra(Intent.EXTRA_SUBJECT, "Medicine order: " + textvalue);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }

    public void displayno(int hey) {
        TextView textview = (TextView) findViewById(R.id.no); textview.setText(String.valueOf(hey));
    }

}
