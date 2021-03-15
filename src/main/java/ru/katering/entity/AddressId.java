package ru.katering.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AddressId implements Serializable {
    private String region;
    private String city;
    private String street;
    private String flat;
    private String index;

    public AddressId(String region, String city, String street, String flat, String index) {
        this.region = region;
        this.city = city;
        this.street = street;
        this.flat = flat;
        this.index = index;
    }

    public AddressId() {
    }
}
