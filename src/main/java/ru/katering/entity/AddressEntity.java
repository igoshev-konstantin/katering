package ru.katering.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class AddressEntity {
    @EmbeddedId
    private AddressId addressId;
}
