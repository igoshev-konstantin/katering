package ru.katering.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "wallet")
    private double wallet;//бумажник/баланс, хотя можно было balance обозначить поле
    @OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},
            mappedBy = "customer",fetch = FetchType.EAGER)
    private List<Order> orderList;

    public void depositMoney(){}
    public void withdrawMoney(){}
    public void makeOrder(){}
}
