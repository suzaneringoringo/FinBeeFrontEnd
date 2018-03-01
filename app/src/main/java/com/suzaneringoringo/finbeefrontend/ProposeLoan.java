package com.suzaneringoringo.finbeefrontend;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by root on 01/03/18.
 */

class ProposeLoan extends AppCompatActivity {

    private Context mContext = this;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propose_loan);
        getSupportActionBar().setTitle("Pinjaman Kebutuhan Mendadak");
        LinearLayout ll = (LinearLayout) findViewById(R.id.propose_loan_background);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
        TextView explanation = (TextView) findViewById(R.id.max_loan_explanation);
        explanation.setText(Html.fromHtml(explanation.getText().toString()));
    }

    public void confirmForm(View view) {
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(this);
        }
        EditText reason_input = (EditText) findViewById(R.id.reason_for_loan);
        EditText amount_input = (EditText) findViewById(R.id.amount);
        builder.setTitle("Info Peminjaman")
                .setMessage(
                        ("Alasan peminjaman: " + reason_input.getText().toString() + "\n" +
                                "Nomor telepon: " + amount_input.getText().toString())
                )
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i("BUTTON", "TES5");
                        Intent intent = new Intent(mContext, LoanReceived.class);
                        startActivity(intent);
                        finish();
                        dialog.cancel();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i("BUTTON", "TES5");
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
