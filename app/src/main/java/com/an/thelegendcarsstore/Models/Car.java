package com.an.thelegendcarsstore.Models;

 public class Car extends Vehicle {
    private float Roof_Load;
    private String Body_Type;
    private boolean Renting_Availability;
    private float Wheel_Size;
    private StringBuilder More_Features;
    private String SunRoof_Type;

     public Car( String fullName, String adding_Date, String manifacrurer, String vehicle_Image, double price, boolean isNew, String body_type, boolean renting_availability,
                 int Airbags_Count) {
         super(fullName,adding_Date,manifacrurer,vehicle_Image,price,isNew);
         String s = String.format("%x",(int)(Math.random()*100));
         while (Administration.Car_ID_isFound(s)) {
             s = String.format("%x",(int)(Math.random()*100));
         }
         this.setProduct_ID(s);
         Body_Type = body_type;
         Price = price;
         Renting_Availability = renting_availability;
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
