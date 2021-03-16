package ru.katering.entity;

import ru.katering.entity.enums.OrderStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;
    @Column(name = "orderNumber")
    private short orderNumber;
    //    @Column("address")
    private String address;//Вынести в отдельный класс
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name = "orderDate")
    private Date orderDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cook_id")
    private Cook cook;
    @Column(name = "orderStatus")
    @Enumerated(EnumType.STRING)/*EnumType.STRING хранится имя этого enum/EnumType.ORDINAL хранится ID этого enum*/
    private OrderStatus orderStatus;

    public double calculateCost() {
        return 0;
    }

    public void setReview() {
    }

    public void cancelOrder() {
    }





}
