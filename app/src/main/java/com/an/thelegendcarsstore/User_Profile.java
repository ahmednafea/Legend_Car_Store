package com.an.thelegendcarsstore;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.an.thelegendcarsstore.Models.Administration;

public class User_Profile extends DialogFragment {
    TextView name,email,mobile;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_user__profile, container, false);
        name=view.findViewById(R.id.user_profile_name);
        email=view.findViewById(R.id.user_profile_email);
        mobile=view.findViewById(R.id.user_profile_mobile);
        name.setText(Administration.Client.getFull_Name());
        email.setText(Administration.Client.getEmail());
        mobile.setText(Administration.Client.getMobile_Number());
        return view;
    }
}
