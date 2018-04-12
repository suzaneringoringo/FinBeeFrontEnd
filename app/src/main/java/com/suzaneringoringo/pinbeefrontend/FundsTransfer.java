package com.suzaneringoringo.pinbeefrontend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by root on 12/04/18.
 */

public class FundsTransfer extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funds_transfer);
    }

    public void Transfer(View view) {
        Intent intent = new Intent(this, LoanSummary.class);
        intent.putExtra("CURRENT_BALANCE", "Rp112.337,50");
        intent.putExtra("PAYMENT_DUE", "Rp687.662,50 (0% interest)");
        intent.putExtra("ADMIN_FEE", "Rp10.000,00 (admin fee)");
        startActivity(intent);
        finish();
    }
}
