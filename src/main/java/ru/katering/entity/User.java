package ru.katering.entity;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String psw;

    @Column(name = "name")
    private String name;

    public void changePassword() {
    }

    public User() {
    }

}
