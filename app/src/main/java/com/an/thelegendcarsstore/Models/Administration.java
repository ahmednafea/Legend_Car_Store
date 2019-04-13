package com.an.thelegendcarsstore.Models;

import java.util.ArrayList;

public class Administration {
    private static ArrayList<Car> Cars;
    private static ArrayList<Truck> Trucks;
    private static ArrayList<Vehicle_Part> Parts;
    private static User Client;
    public static void AddCar(Car car){
        Cars.add(car);
    }
    public static void AddTruck(Truck truck){
        Trucks.add(truck);
    }
    public static void AddPart(Vehicle_Part part){
        Parts.add(part);
    }
    public static void SetUser(User user){
        Client=user;
    }
    public static ArrayList<Car> GetCars(){
        return Cars;
    }

    public static ArrayList<Truck> GetTrucks(){
        return Trucks;
    }

    public static ArrayList<Vehicle_Part> GetParts(){
        return Parts;
    }

    public static User GetClient(){
        return Client;
    }

}
