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
        intent.putExtra("UANG_SEKARANG", "Rp112.337,50");
        startActivity(intent);
        finish();
    }
}
