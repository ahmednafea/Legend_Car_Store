package com.an.thelegendcarsstore.Models;

import android.support.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Firebase_Admin {
    private static DatabaseReference databaseRef;
    private static String users="Users";
    private static String cars="Cars";
    private static String trucks="Trucks";
    private static String parts="Parts";
    private static String reviews="Reviews";
    public static void AddUser(User user){
        databaseRef= FirebaseDatabase.getInstance().getReference(users);
        databaseRef.child(user.getMobile_Number()).setValue(user);
    }
    public static void DeleteUser(String mobile) {
        databaseRef= FirebaseDatabase.getInstance().getReference(users).child(mobile);
        databaseRef.removeValue();
    }
    public static void AddCar(Car car){
        databaseRef= FirebaseDatabase.getInstance().getReference(cars);
        databaseRef.child(car.getProduct_ID()).setValue(car);
    }
    public static void DeleteCar(String ID) {
        databaseRef= FirebaseDatabase.getInstance().getReference(cars).child(ID);
        databaseRef.removeValue();
    }
    public static void AddTruck(Truck truck){
        databaseRef= FirebaseDatabase.getInstance().getReference(trucks);
        databaseRef.child(truck.getProduct_ID()).setValue(truck);
    }

    public static void DeleteTruck(String ID) {
        databaseRef= FirebaseDatabase.getInstance().getReference(trucks).child(ID);
        databaseRef.removeValue();
    }
    public static void AddParts(Vehicle_Part part){
        databaseRef= FirebaseDatabase.getInstance().getReference(parts);
        databaseRef.child(part.getID()).setValue(part);
    }

    public static void DeletePart(String ID) {
        databaseRef= FirebaseDatabase.getInstance().getReference(parts).child(ID);
        databaseRef.removeValue();
    }
    public static void AddReviews(Review review){
        databaseRef= FirebaseDatabase.getInstance().getReference(reviews).child(review.getProduct_ID());
        databaseRef.child(review.getProduct_ID()).setValue(review);
    }
    public static void RetriveUsers(final String mobile,final String pass) {
        databaseRef= FirebaseDatabase.getInstance().getReference(users);
        databaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot usersnap:dataSnapshot.getChildren())
                {
                    User user=usersnap.getValue(User.class);
                    if(user.getMobile_Number().equals(mobile)&&user.getPassword().equals(pass))
                    { Administration.Login(user);}
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    public static boolean User_is_found(final String mobile,final String pass) {
        databaseRef= FirebaseDatabase.getInstance().getReference(users);
        final boolean[] is = {false};
        databaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot usersnap:dataSnapshot.getChildren())
                {
                    User user=usersnap.getValue(User.class);
                    if(user.getMobile_Number().equals(mobile)&&user.getPassword().equals(pass))
                    { is[0] =true;}
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return is[0];
    }
    public static void RetriveCars() {
        databaseRef= FirebaseDatabase.getInstance().getReference(cars);
        databaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot carsnap:dataSnapshot.getChildren())
                {
                    Car car=carsnap.getValue(Car.class);
                    Administration.Cars.add(car);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public static void RetriveTrucks() {
        databaseRef= FirebaseDatabase.getInstance().getReference(trucks);
        databaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot trucksnap:dataSnapshot.getChildren())
                {
                    Truck truck=trucksnap.getValue(Truck.class);
                    Administration.Trucks.add(truck);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public static void RetriveParts() {
        databaseRef= FirebaseDatabase.getInstance().getReference(parts);
        databaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot partsnap:dataSnapshot.getChildren())
                {
                    Vehicle_Part part=partsnap.getValue(Vehicle_Part.class);
                    Administration.Parts.add(part);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public static void RetriveReviews() {
        databaseRef= FirebaseDatabase.getInstance().getReference(reviews);
        databaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot reviewsnap:dataSnapshot.getChildren())
                {
                    Review review=reviewsnap.getValue(Review.class);
                    Administration.Reviews.add(review);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
