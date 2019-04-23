package com.an.thelegendcarsstore.Models;

public class Review {
    private String Reviewer_ID;
    private StringBuilder Review_Message;
    private String Product_ID;

    public Review(String reviewer_ID, StringBuilder review_Message, String product_ID) {
        Reviewer_ID = reviewer_ID;
        Review_Message = review_Message;
        Product_ID = product_ID;
    }

    public String getReviewer_ID() {
        return Reviewer_ID;
    }

    public void setReviewer_ID(String reviewer_ID) {
        Reviewer_ID = reviewer_ID;
    }

    public StringBuilder getReview_Message() {
        return Review_Message;
    }

    public void setReview_Message(StringBuilder review_Message) {
        Review_Message = review_Message;
    }

    public String getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(String product_ID) {
        Product_ID = product_ID;
    }
}
