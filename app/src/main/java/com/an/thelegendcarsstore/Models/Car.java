package com.an.thelegendcarsstore.Models;

 public class Car extends Vehicle {
    private float Roof_Load;
    private String Body_Type;
    private boolean Renting_Availability;
    private boolean Is_Rented;
     private boolean Is_For_Test;
    private float Wheel_Size;
    private StringBuilder More_Features;
    private String SunRoof_Type;

     public Car( String id,String fullName, String adding_Date, String manufacturer, String vehicle_Image, double price, boolean isNew,boolean is_For_Test, String body_type, boolean renting_availability,
                 int Airbags_Count) {
         super(fullName,adding_Date,manufacturer,vehicle_Image,price,isNew);
         this.setProduct_ID(id);
         Body_Type = body_type;
         Price = price;
         Renting_Availability = renting_availability;
         Is_Rented=false;
         Is_For_Test=is_For_Test;
         this.Airbags_Count = Airbags_Count;
         Calc_Safeness();
     }

     public Car() {}

     public boolean isIs_For_Test() {
         return Is_For_Test;
     }

     public void setIs_For_Test(boolean is_For_Test) {
         Is_For_Test = is_For_Test;
     }

     protected void Calc_Safeness(){
     Safety_Value = Airbags_Count /0.8f;
     }

     public boolean isIs_Rented() {
         return Is_Rented;
     }

     public void setIs_Rented(boolean is_Rented) {
         Is_Rented = is_Rented;
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

     public boolean Renting_Availability() {
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
