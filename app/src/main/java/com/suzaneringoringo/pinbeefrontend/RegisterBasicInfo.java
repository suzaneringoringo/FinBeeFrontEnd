package com.suzaneringoringo.pinbeefrontend;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class RegisterBasicInfo extends AppCompatActivity {

    private Context mContext = this;
    /** maintains the pager adapter*/
    private MyPagerAdapter mPagerAdapter;
    /* (non-Javadoc)
     * @see android.support.v4.app.FragmentActivity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_register_basic_info);
    }

    public void confirmForm(View view) {
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(this);
        }
        EditText name_input = (EditText) findViewById(R.id.name_input);
        EditText phone_number_input = (EditText) findViewById(R.id.phone_number_input);
        builder.setTitle("Contact Info")
                .setMessage(
                        ("Name: " + name_input.getText().toString() + "\n" +
                                "Phone number: " + phone_number_input.getText().toString())
                )
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i("BUTTON", "TES5");
                        Intent intent = new Intent(mContext, RegisterScanKTP.class);
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