package ru.katering.entity;

import java.util.List;

public class Customer extends User {
    private double wallet;
    private List<Order> orderList;

    public void depositMoney(){}
    public void withdrawMoney(){}
    public void makeOrder(){}
}
