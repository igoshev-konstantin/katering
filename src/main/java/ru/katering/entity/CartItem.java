package ru.katering.entity;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity

@Table(name = "CartItem")
public class CartItem {

    @Data
    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CartId implements Serializable{
        private Long order_id;
        private Long dish_id;
    }

    @EmbeddedId
    private CartId cartId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "dish_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Dish dish;

    @Column(name = "count")
    private int count;
}
