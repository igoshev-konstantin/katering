package ru.katering.entity;

import ru.katering.entity.enums.CookType;

import javax.persistence.*;

@Entity
@Table(name = "Cook")
public class Cook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "startSalary")
    private double startSalary;

    @Column(name = "cookType")
    @Enumerated(EnumType.STRING)/*EnumType.STRING хранится имя этого enum/EnumType.ORDINAL хранится ID этого enum*/
    private CookType cookType;
    //private List<Review> reviewList; //Зачем в UML это поле, ведь можно review посмотреть из Order'а

}
