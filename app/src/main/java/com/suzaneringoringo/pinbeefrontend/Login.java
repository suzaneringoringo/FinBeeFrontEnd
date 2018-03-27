package com.suzaneringoringo.pinbeefrontend;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

/**
 * Created by root on 01/03/18.
 */

public class Login extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_login);
        LinearLayout ll = (LinearLayout) findViewById(R.id.activity_login_background);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
    }

    public void Login(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
        finish();
    }
}
