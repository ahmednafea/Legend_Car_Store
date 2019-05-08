package com.an.thelegendcarsstore.Admin_Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.an.thelegendcarsstore.Models.Administration;
import com.an.thelegendcarsstore.Models.Car;
import com.an.thelegendcarsstore.Models.Truck;
import com.an.thelegendcarsstore.R;
public class AddVehicle extends Fragment {
    Button AddVehicle;
    EditText name,id,price,factory,img,airbags,type;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_add_vehicl, container, false);
        AddVehicle=view.findViewById(R.id.Vehicle_Add_Btn);
        name=view.findViewById(R.id.Vehicle_Name_Field);
        id=view.findViewById(R.id.Vehicle_ID_Field);
        price=view.findViewById(R.id.Vehicle_Price_Field);
        factory=view.findViewById(R.id.Vehicle_Factory_Field);
        img=view.findViewById(R.id.Vehicle_Image_Field);
        airbags=view.findViewById(R.id.Vehicle_AirBags_Field);
        type=view.findViewById(R.id.Vehicle_Type_Field);
        AddVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().length()>0&&id.getText().length()>0&&price.getText().length()>0&&factory.getText().length()>0&&
                        img.getText().length()>0&&airbags.getText().length()>0){
                    if(type.getText().length()>0){
                        if (type.getText().toString().equals("Car")) {
                            Car c=new Car();
                            c.setProduct_ID(id.getText().toString());
                            c.setAirbags_Count(Integer.valueOf(airbags.getText().toString()));
                            c.setFullName(name.getText().toString());
                            c.setPrice(Double.valueOf(price.getText().toString()));
                            c.setManifacrurer(factory.getText().toString());
                            c.setVehicle_Image(img.getText().toString());
                            Administration.Cars.add(c);

                        }
                        if (type.getText().toString().equals("Truck")) {
                            Truck c=new Truck();
                            c.setProduct_ID(id.getText().toString());
                            c.setAirbags_Count(Integer.valueOf(airbags.getText().toString()));
                            c.setFullName(name.getText().toString());
                            c.setPrice(Double.valueOf(price.getText().toString()));
                            c.setManifacrurer(factory.getText().toString());
                            c.setVehicle_Image(img.getText().toString());
                            Administration.Trucks.add(c);
                        }
                    }
                    else {
                        Toast.makeText(AddVehicle.getContext(), "Please Fill Type Car or Truck", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(AddVehicle.getContext(), "Please Fill All Required Data", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

}
