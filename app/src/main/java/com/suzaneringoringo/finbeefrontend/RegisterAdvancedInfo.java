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

class RegisterAdvancedInfo extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_advanced_info);
        LinearLayout ll = (LinearLayout) findViewById(R.id.sign_up_6_linear_layout);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    public void saveAdvancedInfo(View view) {
        Intent intent = new Intent(this, RegisterScanPaycheck.class);
        startActivity(intent);
        finish();
    }
}
