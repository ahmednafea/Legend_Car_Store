package com.an.thelegendcarsstore.Models;

import com.an.thelegendcarsstore.Algorithems.Quick_Sort;

import java.util.ArrayList;

public class Administration {
    public static ArrayList<Car> Cars=new ArrayList<>();
    public static ArrayList<Truck> Trucks=new ArrayList<>();
    public static ArrayList<Vehicle_Part> Parts=new ArrayList<>();
    public static User Client;
    public static boolean Signed=false;
    public static boolean is_Admin=false;
    public static ArrayList<Review>Reviews=new ArrayList<>();
    public static boolean CarIsFound(String ID){
        for (Car c:Cars) {
            if (c.getProduct_ID().equals(ID))
                return true;
        }
        return false;
    }
    public static boolean TruckIsFound(String ID){
        for (Truck t:Trucks) {
            if (t.getProduct_ID().equals(ID))
                return true;
        }
        return false;
    }
    private static int MAX(int x,int y){
        if(x>y){
            return x;
        }
        return y;
    }
    public static ArrayList<Vehicle> getPopularVehicles(){
        ArrayList<Vehicle> popular=new ArrayList<>();
        if(!Cars.isEmpty()&&!Trucks.isEmpty()) {
            Quick_Sort.Cars_Popularity_Sort(Cars, 0, Cars.size() - 1);
            Quick_Sort.Trucks_Popularity_Sort(Trucks, 0, Trucks.size() - 1);
            for (int i=0;i<MAX(Cars.size(),Trucks.size());i++){
                if(i<Cars.size())
                    popular.add(Cars.get(i));
                if (i<Trucks.size())
                    popular.add(Trucks.get(i));
            }
        }
        return popular;
    }
    public static ArrayList<Car> getRentableVehicles(){
        ArrayList<Car> popular=new ArrayList<>();
        if(!Cars.isEmpty()) {
            for (int i=0;i<Cars.size();i++){
                if(Cars.get(i).Renting_Availability()&&!Cars.get(i).isIs_Rented())
                    popular.add(Cars.get(i));
            }
        }
        return popular;
    }

    public static boolean Car_ID_isFound(String Car_Id){
        for (Car s:Cars) {
            if(s.getProduct_ID().equals(Car_Id))
                return true;
        }
        return false;
    }
    public static boolean Truck_ID_isFound(String Truck_Id){
        for (Truck s:Trucks) {
            if(s.getProduct_ID().equals(Truck_Id))
                return true;
        }
        return false;
    }
    public static Vehicle GetVehicle(String id){
        for (Car s:Cars) {
            if(s.getProduct_ID().equals(id))
                return s;
        }
        for (Truck s:Trucks) {
            if(s.getProduct_ID().equals(id))
                return s;
        }
        return null;
    }
    public static void Login(User user){
        Client=user;
        Signed=true;
        if(Client.getMobile_Number().equals("01128518060"))
            is_Admin=true;
    }
}
