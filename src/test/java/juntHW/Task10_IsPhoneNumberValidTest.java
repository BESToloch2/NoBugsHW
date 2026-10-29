package juntHW;

import junitHW.Task10_IsPhoneNumberValid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class Task10_IsPhoneNumberValidTest {
    /*Тесты должны проверять:
Корректные номера ("+1 1234567890")
Некорректные номера ("12345", "invalid")
*/
    private Task10_IsPhoneNumberValid t10;
    @BeforeEach
    public void setup() {
        t10 = new Task10_IsPhoneNumberValid();
    }

    @Test
    public void userProvideValidPhoneNumber(){
        assertTrue(t10.isValidPhoneNumber("+1 1234567890"));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "12345",
            "invalid"
    })
    public void userProvideInvalidPhoneNumber(String phoneNumber){
        assertFalse(t10.isValidPhoneNumber(phoneNumber));
    }
}


