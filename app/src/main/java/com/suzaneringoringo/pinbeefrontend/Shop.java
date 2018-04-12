package com.suzaneringoringo.pinbeefrontend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by root on 01/03/18.
 */

public class Shop extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
    }

    public void TransferFunds(View view) {
        Intent intent = new Intent(this, FundsTransfer.class);
        startActivity(intent);
        finish();
    }
}
