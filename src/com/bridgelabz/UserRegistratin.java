package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistratin {
    public boolean validationOfFirstName(String str) {
        String regex = "^[A-Z]+[a-z]{2,}";
        return str.matches(regex);
    }

    public boolean validationOfLastName(String str) {

        String regex = "^[A-Z]+[a-z]{2,}";
        return str.matches(regex);
    }

}