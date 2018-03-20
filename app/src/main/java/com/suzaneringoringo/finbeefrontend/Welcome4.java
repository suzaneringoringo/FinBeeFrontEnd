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

public class Welcome4 extends Fragment {

    public static Welcome4 newInstance() {
        Welcome4 fragment = new Welcome4();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome_4, container, false);
        TextView subscreen_description = (TextView) view.findViewById(R.id.subscreen_description_4);
        subscreen_description.setText(Html.fromHtml("<p>Hanya Finbee yang bisa memberikan <b>pinjaman mudah</b> maksimum Rp 1 juta tanpa bunga selama 7 hari.<p>Anda juga dapat memperoleh kebutuhan <b>Pinjaman Kebutuhan Mendadak</b> dengan bunga dan biaya adniminstrasi yang paling rendah.<p>Anda juga dapat memperoleh <b>Pinjaman Modal Kerja</b> denagan bunga yang paling rendah."));
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RelativeLayout ll = (RelativeLayout) getView().findViewById(R.id.welcome_4_linear_layout);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}