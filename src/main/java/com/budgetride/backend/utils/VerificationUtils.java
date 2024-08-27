package com.budgetride.backend.utils;

import java.util.Random;

public class VerificationUtils {
    
    public static int getVerificationCode() {
        return new Random().nextInt(899999) + 100000;
    }

}