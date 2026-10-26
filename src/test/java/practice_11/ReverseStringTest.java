package practice_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import practice_main.practice_11.StringProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("class StringProcessor, method reverse")
public class ReverseStringTest extends StringProcessorTest {
    /**
    Tests for reversing string:
     happy path: "sasha" -> "ahsas"
     corner cases:
        "" -> ""
        "a" -> "a"
     negative: null -> IllegalArgumentException
    */
    @ParameterizedTest
    @CsvSource({
            "sasha, ahsas",
            " '', ''",
            "a, a"
    })
    public void userCanReverseValidString(String input, String expectedResult){
        String actualResult = stringProcessor.reverse(input);
        assertEquals(expectedResult, actualResult, "");
    }

    @Test
    public void userCannotReverseNullString(){

        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "Test should throws IllegalArgumentException");
    }
}
