package com.an.thelegendcarsstore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.an.thelegendcarsstore.Models.Administration;
import com.an.thelegendcarsstore.Models.Vehicle;

public class Product_Profile extends AppCompatActivity {
Button Buy_btn,Rent_btn;
ImageView img;
MultiAutoCompleteTextView Features, Description,Reviews;
TextView name,price;
RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_product__profile);
        Bundle bundle=getIntent().getExtras();
        String code=bundle.getString("Product_Code");
        final Vehicle C= Administration.GetVehicle(code);
        Buy_btn=findViewById(R.id.product_profile_Buybtn);
        Rent_btn=findViewById(R.id.product_profile_Rentbtn);
        img=findViewById(R.id.product_profile_img);
        Features=findViewById(R.id.product_profile_Features);
        Description=findViewById(R.id.product_profile_Description);
        Reviews=findViewById(R.id.product_profile_Reviews);
        name=findViewById(R.id.product_profile_Name);
        price=findViewById(R.id.product_profile_Price);
        ratingBar=findViewById(R.id.product_profile_Rate);
        img.setImageResource(R.drawable.opener_car);
        Features.setText("Max Speed : "+C.getMax_Speed()+"\nMotor Type : V8 465 HP");
        Description.setText(C.getFullName()+" is a powerfull vehicle");
        name.setText(C.getFullName());
        price.setText(String.valueOf(C.getPrice())+" L.E");
        ratingBar.setRating(C.getRating());
        Buy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Administration.Client.AddToCart(C.getProduct_ID());
                Toast.makeText(Product_Profile.this, "Done", Toast.LENGTH_SHORT).show();
            }
        });
        Rent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Administration.Client.SetRented_Car(C.getProduct_ID());

                Toast.makeText(Product_Profile.this, "Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
