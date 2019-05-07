package com.an.thelegendcarsstore.Models;

import java.util.ArrayList;

 public class User {
     private String Full_Name;
     private String Email;
     private String Password;
     private String Mobile_Number;
     private String CreditCard_Number;
     private int Points;
     private ArrayList<String>Reviews;
     private ArrayList<String>History;
     private String Rented_Car;
     private ArrayList<String>Cart;
     private Course Driving_course;

     public User(String full_Name, String email, String password, String mobile_Number, String creditCard_Number) {
         Full_Name = full_Name;
         Email = email;
         Password = password;
         Mobile_Number = mobile_Number;
         CreditCard_Number = creditCard_Number;
         Points=0;
         Reviews=new ArrayList<>();
         History=new ArrayList<>();
         Cart=new ArrayList<>();
     }
     public String getEmail() {
         return Email;
     }
     public void setEmail(String email) {
         Email = email;
     }
     public ArrayList<String> getReviews() {
        return Reviews;
    }
    public void Add_Review(String Review) {
        Reviews.add(Review);
    }
    public ArrayList<String> getHistory() {
        return History;
    }
    public void AddToHistory(String history) {
        History.add(history);
    }
    public String getRented_Car() {
        return Rented_Car;
    }
    public void SetRented_Car(String rentedCars) {
        Rented_Car=rentedCars;
    }
    public ArrayList<String> getCart() {
        return Cart;
    }
    public void AddToCart(String item) {
        Cart.add(item);
    }
    public String getFull_Name() {
        return Full_Name;
    }
    public void setFull_Name(String full_Name) {
        this.Full_Name = full_Name;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Pass) {
        this.Password = Pass;
    }
    public String getMobile_Number() {
        return Mobile_Number;
    }
    public void setMobile_Number(String MobileNum) {
        this.Mobile_Number = MobileNum;
    }
    public String getCreditCard_Number() {
        return CreditCard_Number;
    }
    public void setCreditCard_Number(String creditCard_Number) {
        this.CreditCard_Number = creditCard_Number;
    }
    public int getPoints() {
        return Points;
    }
    public void setPoints(int points) {
        this.Points = points;
    }

     public Course getDriving_course() {
         return Driving_course;
     }

     public void setDriving_course(String start,String end) {
         Driving_course = new Course(start, end);
     }
 }
