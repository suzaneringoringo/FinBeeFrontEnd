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

class Welcome5 extends Fragment {

    public static Welcome5 newInstance() {
        Welcome5 fragment = new Welcome5();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.welcome_5, container, false);
        TextView subscreen_information = (TextView) view.findViewById(R.id.subscreen_information_5);
        subscreen_information.setText(Html.fromHtml("&#8226  &#8226  &#8226  &#8226  &deg  &#8226"));
        TextView subscreen_description = (TextView) view.findViewById(R.id.subscreen_description_5);
        subscreen_description.setText(Html.fromHtml(subscreen_description.getText().toString()));
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LinearLayout ll = (LinearLayout) getView().findViewById(R.id.welcome_5_linear_layout);
        ll.setBackgroundColor(Color.argb(0xff, 0xaa, 0xc9, 0xb9));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}