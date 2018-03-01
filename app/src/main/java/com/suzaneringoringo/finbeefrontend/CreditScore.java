package com.suzaneringoringo.finbeefrontend;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by root on 01/03/18.
 */

class CreditScore extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_score);
        getSupportActionBar().setTitle("Skor Kredit");
        LinearLayout ll = (LinearLayout) findViewById(R.id.credit_score_background);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
        RunAnimationScore();
        TextView terms = (TextView) findViewById(R.id.score_credit_terms);
        terms.setText(Html.fromHtml("<p>Skor Anda dapat naik dan turun.<p>Setiap pelunasan pinjaman akan menaikkan skore kredit Anda sebesar 0,5 poin.<p>Besarnya skor kredit akan menentukan besarnya pinjaman yang bisa Anda peroleh dan jenis pinjaman."));
    }

    private void RunAnimationScore()
    {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.emphasize);
        a.reset();
        TextView score = (TextView) findViewById(R.id.credit_score);
        score.clearAnimation();
        score.startAnimation(a);
    }

    public void scoreOK(View view) {
        Intent intent = new Intent(this, DepositInfo.class);
        startActivity(intent);
        finish();
    }
}


