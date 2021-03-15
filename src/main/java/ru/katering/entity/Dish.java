package ru.katering.entity;

import javax.persistence.*;

@Entity
@Table(name = "Dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dish_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "dishCost")
    private double dishCost;

    public Dish() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDishCost() {
        return dishCost;
    }

    public void setDishCost(double dishCost) {
        this.dishCost = dishCost;
    }
}
