package ru.katering.entity;

import javax.persistence.*;

@Entity
@Table(name = "Dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Long;

    @Column(name = "name")
    private String name;

    @Column(name = "dishCost")
    private double dishCost;

}
