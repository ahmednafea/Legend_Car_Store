package com.an.thelegendcarsstore.Models;

 public class Car extends Vehicle {
    private float Roof_Load;
    private String Body_Type;
    private boolean Renting_Availability;
    private float Wheel_Size;
    private StringBuilder More_Features;
    private String SunRoof_Type;

     public Car(float roof_Load, String body_type, double price, boolean renting_availability,
                float wheel_size, StringBuilder more_features, String sunRoof_type, int Airbags_Count) {
         Roof_Load = roof_Load;
         Body_Type = body_type;
         Price = price;
         Renting_Availability = renting_availability;
         Wheel_Size = wheel_size;
         More_Features = more_features;
         SunRoof_Type = sunRoof_type;
         this.Airbags_Count = Airbags_Count;
         Calc_Safeness();
     }
     protected void Calc_Safeness(){
     Safety_Value = Airbags_Count /0.8f;
     }

     public float getRoof_Load() {
         return Roof_Load;
     }

     public void setRoof_Load(float roof_Load) {
         Roof_Load = roof_Load;
     }

     public String getBody_Type() {
         return Body_Type;
     }

     public void setBody_Type(String body_Type) {
         Body_Type = body_Type;
     }

     public boolean isRenting_Availability() {
         return Renting_Availability;
     }

     public void setRenting_Availability(boolean renting_Availability) {
         Renting_Availability = renting_Availability;
     }

     public float getWheel_Size() {
         return Wheel_Size;
     }

     public void setWheel_Size(float wheel_Size) {
         Wheel_Size = wheel_Size;
     }

     public StringBuilder getMore_Features() {
         return More_Features;
     }

     public void setMore_Features(StringBuilder more_Features) {
         More_Features = more_Features;
     }

     public String getSunRoof_Type() {
         return SunRoof_Type;
     }

     public void setSunRoof_Type(String sunRoof_Type) {
         SunRoof_Type = sunRoof_Type;
     }
     public void setAirbags_Count(int airbags_Count) {
         this.Airbags_Count = airbags_Count;
            Calc_Safeness();
     }
 }
