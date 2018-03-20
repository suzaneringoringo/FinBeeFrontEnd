package com.suzaneringoringo.finbeefrontend;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by root on 25/02/18.
 */

public class Welcome3 extends Fragment {

    public static Welcome3 newInstance() {
        Welcome3 fragment = new Welcome3();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome_3, container, false);
        TextView subscreen_description = (TextView) view.findViewById(R.id.subscreen_description_3);
        subscreen_description.setText(Html.fromHtml("<p>Skor Anda dapat berubah naik dan turun.<p>Semakin banyak informasi yang anda berikan maka semakin tinggi Skor Kredit.<p>Pembayaran pinjaman tepat waktu akan menaikkan Skor Kredit dan akan menurun atas setiap keterlambatan pembayaran."));
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RelativeLayout ll = (RelativeLayout) getView().findViewById(R.id.welcome_3_linear_layout);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}