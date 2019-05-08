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

public class SignIn extends Fragment {
    Button SignIn_Btn;
    EditText EorU,Password;
    public SignIn() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_sign_in, container, false);
        SignIn_Btn=view.findViewById(R.id.sign_in_signbtn);
        EorU=view.findViewById(R.id.sign_in_Mobile);
        Password=view.findViewById(R.id.sign_in_password);
        SignIn_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EorU.getText().length()>0&&Password.getText().length()>0){
                  if(Firebase_Admin.User_is_found(EorU.getText().toString(), Password.getText().toString())){
                      Firebase_Admin.RetriveUsers(EorU.getText().toString(), Password.getText().toString());
                      SignIn.this.startActivity(new Intent(SignIn.this.getContext(), MainActivity.class));
                        SignIn.this.getActivity().finish();
                  }
                }
                else {
                    Toast.makeText(SignIn.this.getContext(), "Please Fill All required fields",Toast.LENGTH_SHORT ).show();
                }
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
