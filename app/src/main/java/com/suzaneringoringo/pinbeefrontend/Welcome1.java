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

public class Welcome1 extends Fragment {

    public static Welcome1 newInstance() {
        Welcome1 fragment = new Welcome1();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome_1, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RelativeLayout ll = (RelativeLayout) getView().findViewById(R.id.welcome_1_linear_layout);
        ll.setBackgroundColor(Color.argb(0xff, 0x4b, 0xa3, 0xaf));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}