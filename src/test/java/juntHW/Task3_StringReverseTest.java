package juntHW;

import junitHW.Task3_StringReverse;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3_StringReverseTest {
    /*
    * happy path: "sasha" -> "ahsas"
    * corner cases:
    * "" -> ""
    * null -> null*/

    @ParameterizedTest
    @CsvSource({
            //happy path
            "sasha, ahsas",
            //corner cases:
            "'', ''",
            " , "
    })
    public void userCanReverseString(String input, String expectedResult){
        Task3_StringReverse t3 = new Task3_StringReverse();
        assertEquals(expectedResult, t3.reverse(input), "Actual result doesn`t match expected");
    }
}
