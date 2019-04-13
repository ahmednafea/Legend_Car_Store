package com.an.thelegendcarsstore.Models;
import java.util.ArrayList;
 class Vehicle_Part {
     String ID;
     String Name;
     String Brand;
     String Manufacturer;
     String Type;
     String Warranty;
     boolean Is_New;
     double Price;
     float Rate;
     StringBuilder Notes;
     StringBuilder Description;
     ArrayList<String>Reviews;

     public Vehicle_Part(String ID, String name, String brand, String manufacturer,
                         String type, String warranty, boolean is_New, double price,
                         StringBuilder notes, StringBuilder description) {
         this.ID = ID;
         Name = name;
         Brand = brand;
         Manufacturer = manufacturer;
         Type = type;
         Warranty = warranty;
         Is_New = is_New;
         Price = price;
         Notes = notes;
         Description = description;
         Rate=0;
         Reviews=new ArrayList<>();
     }

     public boolean isIs_New() {
         return Is_New;
     }

     public void setIs_New(boolean is_New) {
         Is_New = is_New;
     }

     public void setPrice(double price) {
         Price = price;
     }

     public void setRate(float rate) {
         Rate = rate;
     }

     public StringBuilder getNotes() {
        return Notes;
    }
    public void setNotes(StringBuilder Notes) {
        this.Notes = Notes;
    }
    public StringBuilder getDescription() {
        return Description;
    }
    public void setDescription(StringBuilder Description) {
        this.Description = Description;
    }
    public ArrayList<String> getReviews() {
        return Reviews;
    }
    public void setReviews(ArrayList<String> Reviews) {
        this.Reviews = Reviews;
    }
    public String getID() {
        return ID;
    }
    public void setID(String Id) {
        this.ID = Id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public Double getPrice() {
        return Price;
    }
    public void setPrice(Double price) {
        this.Price = price;
    }
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        this.Brand = brand;
    }
    public String getManufacturer() {
        return Manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.Manufacturer = manufacturer;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        this.Type = type;
    }
    public String getWarranty() {
        return Warranty;
    }
    public void setWarranty(String warranty) {
        this.Warranty = warranty;
    }
    public Float getRate() {
        return Rate;
    }
    public void setRate(Float Rate) {
        this.Rate = Rate;
    }
    public void RecordReviews(String review)
    {
         Reviews.add(review);
    }

}
