package com.budgetride.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
@Entity
@Table(name = "CLIENT")
public class ClientJPA extends AccountJPA {

    @Serial
    private static final long serialVersionUID = 5305791765253813119L;


    @PrimaryKeyJoinColumn(name = "ACCOUNTID")

    @Column(name = "NUMBEROFMILESTRAVELLED", nullable = true)
    private int numberOfMilesTravelled;

    // @Column(name = "REWARDS", nullable = true)
    // private String rewards; should be an object, discuss how rewards are calculated( miles back ? and network markering reward)

    // @Column(name = "PAYMENTINFO", nullable = true)
    // private String paymentInfo; // should be an object 
}
