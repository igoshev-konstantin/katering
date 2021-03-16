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

}
