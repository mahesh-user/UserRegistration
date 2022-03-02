package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistationTest {
    @Test
    void givenFirstNameWithFirstLetterCapitalMInThreeCharactersReturnsTrue() {
        UserRegistratin userRegistration = new UserRegistratin();
        Assertions.assertTrue(userRegistration.validationOfFirstName("bhavi"));
    }

    @Test
    void givenLastWithFirstLetterCapitalMInThreeCharactersReturnsTrue() {
        UserRegistratin userRegistration = new UserRegistratin();
        Assertions.assertTrue(userRegistration.validationOfLastName("Bhavi"));

    }
}
