package com.suzaneringoringo.pinbeefrontend;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by root on 27/02/18.
 */

public class RegisterScanPhoto extends AppCompatActivity {

    private int status = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_scan_photo);
        RelativeLayout ll = (RelativeLayout) findViewById(R.id.sign_up_3_linear_layout);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    public void scanPhoto(View view) {
        TextView hint = (TextView) findViewById(R.id.sign_up_3_subtitle);
        Animation a = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        a.reset();
        hint.clearAnimation();
        hint.startAnimation(a);
        if (status == 0) {
            hint.setText("Face to your left.");
            TextView warning = (TextView) findViewById(R.id.sign_up_3_info);
            Animation b = AnimationUtils.loadAnimation(this, R.anim.fade_out);
            b.reset();
            warning.clearAnimation();
            warning.startAnimation(b);
        } else if (status == 1) {
            hint.setText("Face to your right.");
        } else if (status == 2) {
            hint.setText("Open your mouth.");
        } else {
            Intent intent = new Intent(this, RegisterScanWorkPhoto.class);
            startActivity(intent);
            finish();
        }
        a = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        a.reset();
        hint.clearAnimation();
        hint.startAnimation(a);
        status++;
    }
}
