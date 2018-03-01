package com.suzaneringoringo.finbeefrontend;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by root on 01/03/18.
 */

class DepositInfo extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit_info);
        getSupportActionBar().setTitle("Pinjaman Mudah");
        RelativeLayout ll = (RelativeLayout) findViewById(R.id.credit_score_background);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
    }

    public void delayLoan(View view) {
        Intent intent = new Intent(this, DelayLoan.class);
        startActivity(intent);
        finish();
    }

    public void transfer(View view) {
        Intent intent = new Intent(this, LoanSummary.class);
        startActivity(intent);
        finish();
    }
}
