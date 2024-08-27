package com.budgetride.backend.core;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Client extends Account {

   private int numberOfMilesTravelled;

   private String rewards; // TODO: Check type. Do we need object?

    private String paymentInfo;


    public Client() {

    }

}