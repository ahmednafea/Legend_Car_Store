package com.an.thelegendcarsstore.Models;

 public class Truck extends Vehicle {
     private String Cap_Type;
     private String Truck_Type;
     private String SunRoof_Type;
     private float TrackingLimit;
     private float Wheels_Size;
     private StringBuilder More_Features;

     public Truck(String fullName, String adding_Date, String manufacturer, String vehicle_Image, double price, boolean isNew, String truck_Type) {
         super(fullName,adding_Date,manufacturer,vehicle_Image,price,isNew);
         String s = String.format("%x",(int)(Math.random()*100));
         while (Administration.Truck_ID_isFound(s)) {
             s = String.format("%x",(int)(Math.random()*100));
         }
         this.setProduct_ID(s);
         Truck_Type = truck_Type;
     }

     public Truck() {

     }

     @Override
     public void Calc_Safeness() {
        this.Safety_Value=this.Airbags_Count /1.2f;
     }

     public String getCap_Type() {
         return Cap_Type;
     }

     public void setCap_Type(String cap_Type) {
         Cap_Type = cap_Type;
     }

     public String getTruck_Type() {
         return Truck_Type;
     }

     public void setTruck_Type(String truck_Type) {
         Truck_Type = truck_Type;
     }

     public String getSunRoof_Type() {
         return SunRoof_Type;
     }

     public void setSunRoof_Type(String sunRoof_Type) {
         SunRoof_Type = sunRoof_Type;
     }

     public float getTrackingLimit() {
         return TrackingLimit;
     }

     public void setTrackingLimit(float trackingLimit) {
         TrackingLimit = trackingLimit;
     }

     public float getWheels_Size() {
         return Wheels_Size;
     }

     public void setWheels_Size(float wheels_Size) {
         Wheels_Size = wheels_Size;
     }

     public StringBuilder getMore_Features() {
         return More_Features;
     }

     public void setMore_Features(StringBuilder more_Features) {
         More_Features = more_Features;
     }
     public void setAirbags_Count(int airbags_Count) {
         this.Airbags_Count = airbags_Count;
         Calc_Safeness();
     }
 }
