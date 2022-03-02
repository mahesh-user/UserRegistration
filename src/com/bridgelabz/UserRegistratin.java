package com.bridgelabz;

public class UserRegistratin {
    public boolean validationOfFirstName(String str) {
        String regex = "^[A-Z]+[a-z]{2,}";
        return str.matches(regex);
    }
}
