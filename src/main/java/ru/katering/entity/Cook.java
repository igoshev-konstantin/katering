package ru.katering.entity;

import java.util.List;

public class Cook extends User{

    private enum CookType{CONFECTIONER, FISHCOOK, MEATCOOK}
    private double startSalary;
    private List<Review> reviewList;

    public void createDish(){}
    public void editDish(){}
    public void removeDish(){}

    public Cook() {
    }

    public double getStartSalary() {
        return startSalary;
    }

    public void setStartSalary(double startSalary) {
        this.startSalary = startSalary;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }
}
