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

class Welcome6 extends Fragment {

    public static Welcome6 newInstance() {
        Welcome6 fragment = new Welcome6();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.welcome_6, container, false);
        TextView subscreen_information = (TextView) view.findViewById(R.id.subscreen_information_6);
        subscreen_information.setText(Html.fromHtml("&#8226  &#8226  &#8226  &#8226  &#8226  &deg"));
        TextView subscreen_description = (TextView) view.findViewById(R.id.subscreen_description_6);
        subscreen_description.setText(Html.fromHtml(subscreen_description.getText().toString()));
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LinearLayout rl = (LinearLayout) getView().findViewById(R.id.welcome_6_linear_layout);
        rl.setBackgroundColor(Color.argb(0xff, 0x4a, 0xa3, 0xcb));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}