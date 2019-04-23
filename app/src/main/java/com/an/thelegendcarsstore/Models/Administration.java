package com.an.thelegendcarsstore.Models;

import com.an.thelegendcarsstore.Algorithems.Quick_Sort;

import java.util.ArrayList;

public class Administration {
    public static ArrayList<Car> Cars=new ArrayList<>();
    public static ArrayList<Truck> Trucks=new ArrayList<>();
    public static ArrayList<Vehicle_Part> Parts=new ArrayList<>();
    public static User Client;
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
    public static ArrayList<Vehicle> getPopularVehicles(){
        ArrayList<Vehicle> popular=new ArrayList<>();
        for (int i=0;i<10;i++) {
            if (Cars.get(i).Rating>=4)
                popular.add(Cars.get(i));
            if (Trucks.get(i).Rating>=4)
                popular.add(Trucks.get(i));
            if (popular.size()>=10)
                break;
        }
        return popular;
    }
    public static ArrayList<Car> getNewestCars(){
        ArrayList<Car> Newest=Cars;
        Quick_Sort.Cars_Sort(Newest,0 ,Newest.size()-1);
        return Newest;
    }

    public static ArrayList<Truck> getNewestTrucks(){
        ArrayList<Truck> Newest=Trucks;
        Quick_Sort.Trucks_Sort(Newest,0 ,Newest.size()-1);
        return Newest;
    }
}
