package com.suzaneringoringo.pinbeefrontend;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by root on 01/03/18.
 */

public class LoanSummary extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_summary);

        Intent intent = getIntent();
        String nilai = intent.getStringExtra("CURRENT_BALANCE");
        if (nilai != null) {
            TextView cashAdvanceAvailable = (TextView) findViewById(R.id.cash_advance_available);
            cashAdvanceAvailable.setText(nilai);
            TextView paymentDue = (TextView) findViewById(R.id.payment_due);
            String paymentDueValue = intent.getStringExtra("PAYMENT_DUE");
            paymentDue.setText(paymentDueValue);
            TextView adminFee = (TextView) findViewById(R.id.admin_fee);
            String adminFeeValue = intent.getStringExtra("ADMIN_FEE");
            adminFee.setText(adminFeeValue);
        }
    }

    public void openProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
        finish();
    }

    public void Shop(View view) {
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
        finish();
    }

    public void GoHome(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        finish();
    }
}
