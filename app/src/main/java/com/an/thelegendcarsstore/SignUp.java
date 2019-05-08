package com.an.thelegendcarsstore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.an.thelegendcarsstore.Models.Firebase_Admin;
import com.an.thelegendcarsstore.Models.User;


public class SignUp extends Fragment {
    Button Signup;
    EditText UserName,Password,Email,Mobile;
    public SignUp() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_sign_up, container, false);
        Signup =view.findViewById(R.id.sign_up_signbtn);
        UserName=view.findViewById(R.id.sign_up_username);
        Password=view.findViewById(R.id.sign_up_password);
        Email=view.findViewById(R.id.sign_up_email);
        Mobile=view.findViewById(R.id.sign_up_Mobile);
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Email.getText().length() > 0 && UserName.getText().length() > 0 && Password.getText().length() > 0 && Mobile.getText().length() > 0) {
                   if(!Firebase_Admin.User_is_found(Mobile.getText().toString(), Password.getText().toString())){
                    Firebase_Admin.AddUser(new User(UserName.getText().toString(), Email.getText().toString(),
                            Password.getText().toString(), Mobile.getText().toString(), "1234"));
                       Toast.makeText(SignUp.this.getContext(),"Recorded Successfully" , Toast.LENGTH_LONG).show();
                    SignUp.this.startActivity(new Intent(SignUp.this.getContext(), MainActivity.class));
                    SignUp.this.getActivity().finish();}
                   else {
                       Toast.makeText(SignUp.this.getContext(),"this mobile is existes , Please enter another" , Toast.LENGTH_LONG).show();
                   }
                }
                else{
                    Toast.makeText(SignUp.this.getContext(), "Please Fill All Required Data", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
