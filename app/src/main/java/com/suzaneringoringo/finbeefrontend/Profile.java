package com.suzaneringoringo.finbeefrontend;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by root on 01/03/18.
 */

class Profile extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        LinearLayout ll = (LinearLayout) findViewById(R.id.profile_background);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
    }

    public void proposeLoan(View view) {
        Intent intent = new Intent(this, ProposeLoan.class);
        startActivity(intent);
        finish();
    }
}
