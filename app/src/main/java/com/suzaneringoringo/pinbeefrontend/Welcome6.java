package com.suzaneringoringo.pinbeefrontend;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by root on 25/02/18.
 */

public class Welcome6 extends Fragment {

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
        View view = inflater.inflate(R.layout.fragment_welcome_6, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RelativeLayout rl = (RelativeLayout) getView().findViewById(R.id.welcome_6_linear_layout);
        rl.setBackgroundColor(Color.argb(0xff, 0x4a, 0xa3, 0xcb));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}