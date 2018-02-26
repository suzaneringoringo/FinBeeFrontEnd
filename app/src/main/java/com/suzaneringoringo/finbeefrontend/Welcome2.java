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
import android.widget.TextView;

/**
 * Created by root on 25/02/18.
 */

class Welcome2 extends Fragment {

    public static Welcome2 newInstance() {
        Welcome2 fragment = new Welcome2();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.welcome_2, container, false);
        TextView subscreen_information = (TextView) view.findViewById(R.id.subscreen_information_2);
        subscreen_information.setText(Html.fromHtml("&#8226  &deg  &#8226  &#8226  &#8226  &#8226"));
        TextView subscreen_description = (TextView) view.findViewById(R.id.subscreen_description_2);
        subscreen_description.setText(Html.fromHtml(subscreen_description.getText().toString()));
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LinearLayout ll = (LinearLayout) getView().findViewById(R.id.welcome_2_linear_layout);
        ll.setBackgroundColor(Color.argb(0xff, 0xda, 0x55, 0x44));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}