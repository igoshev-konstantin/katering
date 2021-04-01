package ru.katering.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.katering.POJO.Address;
import ru.katering.entity.enums.OrderStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "orderNumber")
    private short orderNumber;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "region", column = @Column(name = "adrRegion")),
            @AttributeOverride(name = "city", column = @Column(name = "adrCity")),
            @AttributeOverride(name = "street", column = @Column(name = "adrStreet")),
            @AttributeOverride(name = "flat", column = @Column(name = "adrFlat")),
            @AttributeOverride(name = "index", column = @Column(name = "adrIndex"))
    })
    private Address address;

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

    @OneToMany(mappedBy = "order")
    private Set<CartItem> cartItems;


}
