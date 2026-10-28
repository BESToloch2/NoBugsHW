package juntHW;

import junitHW.Task6_IsEmailValid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task6_IsEmailValidTest {
    /*happy path: "test@example.com" -> true
    * negative:
    * "bad@.com" -> false
    * "no-at-symbol" -> false
    * null -> false*/

    private Task6_IsEmailValid t6;

    @BeforeEach
    public void setup(){
        t6 = new Task6_IsEmailValid();
    }

    //happy path
    @Test
    public void userProvideValidEmail(){
        assertTrue(t6.isValidEmail("test@example.com"));
    }

    //negative
    @ParameterizedTest
    @ValueSource(strings = {"bad@.com","test2example.com"})
    @NullSource
    public void userProvideInvalidEmail(String input){
        assertFalse(t6.isValidEmail(input));
    }
}
