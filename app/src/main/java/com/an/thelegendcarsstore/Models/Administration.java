package com.an.thelegendcarsstore.Models;

import com.an.thelegendcarsstore.Algorithems.Quick_Sort;

import java.util.ArrayList;

public class Administration {
    public static ArrayList<Car> Cars;
    public static ArrayList<Truck> Trucks;
    public static ArrayList<Vehicle_Part> Parts;
    public static User Client;
    public static boolean CarIsFound(String ID){
        for (Car c:Cars) {
            if (c.getProduct_ID().equals(ID))
                return true;
        }
        return false;
    }
    public static ArrayList<Vehicle> getPopularVehicles(){
        ArrayList<Vehicle> popular=new ArrayList<>();
        for (Car c:Cars) {
            if (c.Rating>=4)
                popular.add(c);
        }
        for (Truck t:Trucks) {
            if (t.Rating>=4)
                popular.add(t);
        }
        return popular;
    }
    public static ArrayList<Car> getNewestCars(){
        ArrayList<Car> Newest=Cars;
        Quick_Sort.Cars_Sort(Newest,0 ,Newest.size()-1);
        return Newest;
    }

}
