package com.suzaneringoringo.finbeefrontend;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by root on 27/02/18.
 */

class RegisterScanPhoto extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_scan_photo);
        LinearLayout ll = (LinearLayout) findViewById(R.id.sign_up_3_linear_layout);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    public void scanPhoto(View view) {
        Intent intent = new Intent(this, RegisterScanCreditCard.class);
        startActivity(intent);
        finish();
    }
}
