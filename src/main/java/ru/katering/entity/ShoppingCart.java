package ru.katering.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ShoppingCart {

    @Column(name = "cartCount")
    private int count;
    @Column(name = "cartDish")
    private Dish dish;    //В uml просто Product, а я так понял в карзину мы множество блюд положить можем.

    public void addDish(){};
    public void removeDish(){};
    public void changingCount(){};

}
