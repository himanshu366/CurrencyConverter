package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        Log.i("Info", "Button pressed");
        EditText editText = (EditText) findViewById(R.id.editText);
        String amountInPounds = editText.getText().toString();
        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        Double amountInDollarsDouble = amountInPoundsDouble * 1.3;
        String amountInDollarsString = Double.toString(amountInDollarsDouble);
        Log.i("Info", amountInDollarsString);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
