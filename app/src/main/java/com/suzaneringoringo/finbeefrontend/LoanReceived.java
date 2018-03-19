package com.suzaneringoringo.finbeefrontend;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by root on 01/03/18.
 */

class LoanReceived extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_received);
        LinearLayout ll = (LinearLayout) findViewById(R.id.loan_received_background);
        ll.setBackgroundColor(Color.argb(0xff, 0x0e, 0x89, 0xa8));
    }

}
