package ru.katering.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table("Order_Cart_Dish")
public class Order_Cart_Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Embedded
    private ShoppingCart shoppingCart;
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    /*insertable = false, updatable = false - You would do that when the responsibility of creating/updating the
    referenced column isn't in the current entity, but in another entity.*/
    private Order order;
    @ManyToOne
    @JoinColumn(name = "dish_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Dish dish;
    @Column(name = "count")
    private int count;

    @Embeddable
    public class ShoppingCart implements Serializable {
        private int count;
        private int dish_id;    //В uml просто Product, а я так понял в карзину мы множество блюд положить можем.
    }
}
