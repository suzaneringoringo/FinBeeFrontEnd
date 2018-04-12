package com.suzaneringoringo.pinbeefrontend;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by root on 01/03/18.
 */

public class LoanSummary extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_summary);
        LinearLayout ll = (LinearLayout) findViewById(R.id.loan_summary_background);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));

        Intent intent = getIntent();
        TextView cashAdvanceAvailable = (TextView) findViewById(R.id.cash_advance_available);
        String nilai = intent.getStringExtra("UANG_SEKARANG");
        if (nilai != null) {
            cashAdvanceAvailable.setText(nilai);
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
}
