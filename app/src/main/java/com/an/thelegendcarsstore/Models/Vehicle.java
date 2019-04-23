package com.an.thelegendcarsstore.Models;

import java.util.ArrayList;

public abstract class Vehicle {
    protected String Product_ID;
    protected String FullName;
    protected String productionDate;
    protected String Drive_Wheel_Config;
    protected String Fuel_Type;
    protected String Model_Date;
    protected String Adding_Date;
    protected String Vehicle_Config;
    protected String vehicle_Engine;
    protected String Wheel_Base_Type;
    protected String Manifacrurer;
    protected String Primary_Colour;
    protected String Secondary_Colour;
    protected String Vehicle_Image;
    protected float Acceleration;
    protected float Cargo_Volume;
    protected float Emission_CO2;
    protected float Environmental_Evaluation;
    protected float Fuel_Capacity;
    protected float Fuel_Consumption;
    protected float Odometer_Millage;
    protected float Max_Speed;
    protected float Vehicle_Weight;
    protected float Rating;
    protected float Height;
    protected float Safety_Value;
    protected int Axises_Count;
    protected int Doors_Count;
    protected int Seats_Count;
    protected int Airbags_Count;
    protected double Price;
    protected boolean IsNew;
    protected ArrayList<String> Reviews;

    public Vehicle(String product_ID, String fullName, String adding_Date, String manifacrurer, String vehicle_Image, double price, boolean isNew) {
        Product_ID = product_ID;
        FullName = fullName;
        Adding_Date = adding_Date;
        Manifacrurer = manifacrurer;
        Vehicle_Image = vehicle_Image;
        Price = price;
        IsNew = isNew;
    }

    protected abstract void Calc_Safeness();


    public String getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(String product_ID) {
        Product_ID = product_ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getDrive_Wheel_Config() {
        return Drive_Wheel_Config;
    }

    public void setDrive_Wheel_Config(String drive_Wheel_Config) {
        Drive_Wheel_Config = drive_Wheel_Config;
    }

    public String getAdding_Date() {
        return Adding_Date;
    }

    public void setAdding_Date(String adding_Date) {
        Adding_Date = adding_Date;
    }

    public void setSafety_Value(float safety_Value) {
        Safety_Value = safety_Value;
    }

    public void setReviews(ArrayList<String> reviews) {
        Reviews = reviews;
    }

    public String getFuel_Type() {
        return Fuel_Type;
    }

    public void setFuel_Type(String fuel_Type) {
        Fuel_Type = fuel_Type;
    }

    public String getModel_Date() {
        return Model_Date;
    }

    public void setModel_Date(String model_Date) {
        Model_Date = model_Date;
    }

    public String getVehicle_Config() {
        return Vehicle_Config;
    }

    public void setVehicle_Config(String vehicle_Config) {
        Vehicle_Config = vehicle_Config;
    }

    public String getVehicle_Engine() {
        return vehicle_Engine;
    }

    public void setVehicle_Engine(String vehicle_Engine) {
        this.vehicle_Engine = vehicle_Engine;
    }

    public String getWheel_Base_Type() {
        return Wheel_Base_Type;
    }

    public void setWheel_Base_Type(String wheel_Base_Type) {
        Wheel_Base_Type = wheel_Base_Type;
    }

    public String getManifacrurer() {
        return Manifacrurer;
    }

    public void setManifacrurer(String manifacrurer) {
        Manifacrurer = manifacrurer;
    }

    public String getPrimary_Colour() {
        return Primary_Colour;
    }

    public void setPrimary_Colour(String primary_Colour) {
        Primary_Colour = primary_Colour;
    }

    public String getSecondary_Colour() {
        return Secondary_Colour;
    }
    public void setSecondary_Colour(String secondary_Colour) {
        Secondary_Colour = secondary_Colour;
    }

    public String getVehicle_Image() {
        return Vehicle_Image;
    }

    public void setVehicle_Image(String vehicle_Image) {
        Vehicle_Image = vehicle_Image;
    }

    public float getAcceleration() {
        return Acceleration;
    }

    public void setAcceleration(float acceleration) {
        Acceleration = acceleration;
    }

    public float getCargo_Volume() {
        return Cargo_Volume;
    }

    public void setCargo_Volume(float cargo_Volume) {
        Cargo_Volume = cargo_Volume;
    }

    public float getEmission_CO2() {
        return Emission_CO2;
    }

    public void setEmission_CO2(float emission_CO2) {
        Emission_CO2 = emission_CO2;
    }

    public float getEnvironmental_Evaluation() {
        return Environmental_Evaluation;
    }

    public void setEnvironmental_Evaluation(float environmental_Evaluation) {
        Environmental_Evaluation = environmental_Evaluation;
    }

    public float getFuel_Capacity() {
        return Fuel_Capacity;
    }

    public void setFuel_Capacity(float fuel_Capacity) {
        Fuel_Capacity = fuel_Capacity;
    }

    public float getFuel_Consumption() {
        return Fuel_Consumption;
    }

    public void setFuel_Consumption(float fuel_Consumption) {
        Fuel_Consumption = fuel_Consumption;
    }

    public float getOdometer_Millage() {
        return Odometer_Millage;
    }

    public void setOdometer_Millage(float odometer_Millage) {
        Odometer_Millage = odometer_Millage;
    }

    public float getMax_Speed() {
        return Max_Speed;
    }

    public void setMax_Speed(float max_Speed) {
        Max_Speed = max_Speed;
    }

    public float getVehicle_Weight() {
        return Vehicle_Weight;
    }

    public void setVehicle_Weight(float vehicle_Weight) {
        Vehicle_Weight = vehicle_Weight;
    }

    public float getRating() {
        return Rating;
    }

    public void setRating(float rating) {
        Rating = rating;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float height) {
        Height = height;
    }

    public int getAxises_Count() {
        return Axises_Count;
    }

    public void setAxises_Count(int axises_Count) {
        Axises_Count = axises_Count;
    }

    public int getDoors_Count() {
        return Doors_Count;
    }

    public void setDoors_Count(int doors_Count) {
        Doors_Count = doors_Count;
    }

    public int getSeats_Count() {
        return Seats_Count;
    }

    public void setSeats_Count(int seats_Count) {
        Seats_Count = seats_Count;
    }

    public int getAirbags_Count() {
        return Airbags_Count;
    }

    public void setAirbags_Count(int airbags_Count) {
        Airbags_Count = airbags_Count;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public boolean isNew() {
        return IsNew;
    }

    public void setNew(boolean aNew) {
        IsNew = aNew;
    }

    public float getSafety_Value() {
        return Safety_Value;
    }

    public ArrayList<String> getReviews() {
        return Reviews;
    }
    public void Add_Review(String new_Review){
        Reviews.add(new_Review);
    }
}
