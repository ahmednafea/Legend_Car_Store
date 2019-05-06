package com.an.thelegendcarsstore.Algorithems;

import com.an.thelegendcarsstore.Models.Car;
import com.an.thelegendcarsstore.Models.Truck;

import java.util.ArrayList;

public class Quick_Sort {

    private static int Cars_Partition(ArrayList<Car> vehicles, int low, int high)
        {
            float pivot = vehicles.get(high).getRating();
            int i = (low-1);
            for (int j=low; j<high; j++)
            {
                if (vehicles.get(j).getRating() <= pivot)
                {
                    i++;
                    Car temp = vehicles.get(i);
                    vehicles.set(i,vehicles.get(j));
                    vehicles.set(j,temp);
                }
            }
            Car temp = vehicles.get(i+1);
            vehicles.set(i+1,vehicles.get(high));
            vehicles.set(high,temp);
            return i+1;
        }
       public static void Cars_Popularity_Sort(ArrayList<Car> vehicles, int low, int high)
        {
            if (low < high)
            {
                int pi = Cars_Partition(vehicles, low, high);
                Cars_Popularity_Sort(vehicles, low, pi-1);
                Cars_Popularity_Sort(vehicles, pi+1, high);
            }

        }

    private static int Trucks_Partition(ArrayList<Truck> vehicles, int low, int high)
    {
        float pivot =vehicles.get(high).getRating();
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (vehicles.get(j).getRating() <= pivot)
            {
                i++;
                Truck temp = vehicles.get(i);
                vehicles.set(i,vehicles.get(j));
                vehicles.set(j,temp);
            }
        }
        Truck temp = vehicles.get(i+1);
        vehicles.set(i+1,vehicles.get(high));
        vehicles.set(high,temp);
        return i+1;
    }
    public static void Trucks_Popularity_Sort(ArrayList<Truck> vehicles, int low, int high)
    {
        if (low < high)
        {
            int pi = Trucks_Partition(vehicles, low, high);
            Trucks_Popularity_Sort(vehicles, low, pi-1);
            Trucks_Popularity_Sort(vehicles, pi+1, high);
        }

    }
}
