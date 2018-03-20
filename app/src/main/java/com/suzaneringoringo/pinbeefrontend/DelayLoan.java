package com.suzaneringoringo.pinbeefrontend;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by root on 01/03/18.
 */

public class DelayLoan extends AppCompatActivity {

    private Context mContext = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delay_loan);
        LinearLayout ll = (LinearLayout) findViewById(R.id.delay_loan_background);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
        TextView terms = (TextView) findViewById(R.id.delay_loan_terms);
        terms.setText(Html.fromHtml(terms.getText().toString()));
    }

    public void suddenLoan(View view) {
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(this);
        }
        EditText name_input = (EditText) findViewById(R.id.name_input);
        EditText phone_number_input = (EditText) findViewById(R.id.phone_number_input);
        builder.setTitle("Anda belum membutuhkan Pinjaman Kebutuhan Mendadak")
                .setMessage(
                        ("Berdasarkan skor kredit Anda saat ini, Anda belum dapat mengajukan pinjaman modal kerja. " +
                                "Anda memerlukan minimum 9 untuk dapat mengajukan pinjaman modal kerja.")
                )
                .setPositiveButton("Keluar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Intent intent = new Intent(mContext, Login.class);
                        startActivity(intent);
                        finish();
                    }
                })
                .setNegativeButton("Kembali", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(mContext, CreditScore.class);
                        startActivity(intent);
                        finish();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void proposeLoan(View view) {
        Intent intent = new Intent(this, ProposeLoan.class);
        startActivity(intent);
        finish();
    }
}
