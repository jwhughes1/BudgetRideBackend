package com.budgetride.backend.entity;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ACCOUNT")
@Inheritance(strategy = InheritanceType.JOINED)
// @DiscriminatorValue(value = "ACCOUNT")
// @DiscriminatorColumn(
// name="discriminator",
// discriminatorType=DiscriminatorType.STRING
// )
public class AccountJPA implements Serializable {


    @Serial
    private static final long serialVersionUID = 8623914354871345466L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNTID")
    private Long accountId;

    @Column(name = "FIRSTNAME", nullable = false)
    private String firstName;

    @Column(name = "LASTNAME", nullable = false)
    private String lastName;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PHONE", nullable = false)
    private String phone;

    @Column(name = "TYPE", nullable = false)
    private String type; // create enum

    @Column(name = "DATEOFBIRTH", nullable = true)
    private String dateOfBirth;

    @Column(name = "SEX")
    private String sex; // create enum

    @Column(name = "COUNTRY", nullable = false)
    private String country;
}
