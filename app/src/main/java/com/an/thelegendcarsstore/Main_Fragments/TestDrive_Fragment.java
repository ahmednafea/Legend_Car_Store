package com.an.thelegendcarsstore.Main_Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import com.an.thelegendcarsstore.Models.Administration;
import com.an.thelegendcarsstore.R;

public class TestDrive_Fragment extends Fragment {
    DatePicker picker;
    Button startbtn,endbtn,registerbtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_testdrive, container, false);
        picker=view.findViewById(R.id.Course_Date_Picker);
        startbtn=view.findViewById(R.id.StartDate_btn);
        endbtn=view.findViewById(R.id.EndDate_btn);
        registerbtn=view.findViewById(R.id.Course_Register_btn);
        picker.setMinDate(System.currentTimeMillis() - 1000);
       if(Administration.Signed=true) {
           final String[] date = new String[2];
           startbtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   date[0] = picker.getDayOfMonth() + "-" + (picker.getMonth() + 1) + "-" + picker.getYear();
               }
           });

           endbtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   date[1] = picker.getDayOfMonth() + "-" + (picker.getMonth() + 1) + "-" + picker.getYear();
                   if (!date[0].isEmpty())
                       registerbtn.setEnabled(true);
                   registerbtn.setVisibility(View.VISIBLE);
               }
           });
           registerbtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Administration.Client.setDriving_course(date[0], date[1]);
               }
           });
       }
       else {
           picker.setVisibility(View.INVISIBLE);
           picker.setEnabled(false);

           startbtn.setVisibility(View.INVISIBLE);
           startbtn.setEnabled(false);

           endbtn.setVisibility(View.INVISIBLE);
           endbtn.setEnabled(false);
           Toast.makeText(this.getContext(), "Please Sign In First", Toast.LENGTH_LONG).show();
       }
       return view;
    }

}
