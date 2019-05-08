package com.an.thelegendcarsstore.Main_Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.an.thelegendcarsstore.R;
import com.an.thelegendcarsstore.User_Profile;

public class Setting_Fragment extends Fragment {
    Button signing_btn,profile_btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        signing_btn=view.findViewById(R.id.Signing_Btn);
        profile_btn=view.findViewById(R.id.Profile_Btn);
        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProfileDialog();
            }
        });
        return view;
    }
    private void showProfileDialog() {

        FragmentManager fm = this.getActivity().getSupportFragmentManager();
        User_Profile userProfile=new User_Profile();
        userProfile.show(fm, "fragment_User_Profile");

    }

}
