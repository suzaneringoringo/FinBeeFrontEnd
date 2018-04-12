package com.suzaneringoringo.pinbeefrontend;

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
        subscreen_description.setText(Html.fromHtml("<p>Only pinBee can provide <b>cash advanced</b> with the maximum of Rp 1 million without interest within 7 days.<p>You can also receive <b>Sudden Loan</b> with lowest interest and administration fee.<p>You can also receive <b>Working Capital Loan</b> with lowest interest."));
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