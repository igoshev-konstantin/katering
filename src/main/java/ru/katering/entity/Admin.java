package ru.katering.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

//    public List<Order> getCurrentOrders() {
//        return null;
//    }
//
//    public Order getOrderInfo() {
//        return null;
//    }
//
//    public void removeCook() {
//    }
//
//    public void editCook() {
//    }

}
