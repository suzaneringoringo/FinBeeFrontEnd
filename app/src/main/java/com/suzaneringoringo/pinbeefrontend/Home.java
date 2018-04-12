package com.suzaneringoringo.pinbeefrontend;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

/**
 * Created by root on 12/04/18.
 */

public class Home extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        LinearLayout ll = (LinearLayout) findViewById(R.id.loan_received_background);
        ll.setBackgroundColor(Color.argb(0xff, 0x0e, 0x89, 0xa8));
    }

}
