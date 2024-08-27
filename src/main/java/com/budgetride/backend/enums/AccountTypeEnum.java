package com.budgetride.backend.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AccountTypeEnum {

    @JsonProperty("client")
    CLIENT("client"),

    @JsonProperty("driver")
    DRIVER("driver");

    private String value;

    AccountTypeEnum(String type) {
        this.value = type;
    }

    public String getValue() {
        return this.value;
    }

    public static AccountTypeEnum valueToEnum(String givenValue) {
        if (givenValue != null && !givenValue.isEmpty()) {
            for (AccountTypeEnum enumValue : AccountTypeEnum.values()) {
                if (enumValue.value.equals(givenValue)) {
                    return enumValue;
                }
            }
        }
        return null;
    }

}
