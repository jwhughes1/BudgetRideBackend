package com.budgetride.backend.enums;

import com.fasterxml.jackson.annotation.JsonProperty;


public enum DriverStatusEnum {
   


    @JsonProperty("available")
    AVAILABLE("available"),

    @JsonProperty("unavailable")
    UNAVAILABLE("unavailable");

    private String value;

    DriverStatusEnum(String type) {
        this.value = type;
    }

    public String getValue() {
        return this.value;
    }

    public static DriverStatusEnum valueToEnum(String givenValue) {
        if (givenValue != null && !givenValue.isEmpty()) {
            for (DriverStatusEnum enumValue : DriverStatusEnum.values()) {
                if (enumValue.value.equals(givenValue)) {
                    return enumValue;
                }
            }
        }
        return null;
    }



}
