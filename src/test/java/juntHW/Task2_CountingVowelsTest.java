package juntHW;

import junitHW.Task2_CountingVowels;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import practice_main.practice_11.StringProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task2_CountingVowelsTest {
    private Task2_CountingVowels t2;

    @BeforeEach
    public void setup(){
        t2 = new Task2_CountingVowels();
    }

    /*
    * happy path: "AeIoU" -> 5
    * corner cases:
    * "java" -> 2
    * "bcdfg" -> 0
    * "" -> 0
    * negative: null -> "IllegalArgumentException" */

    @ParameterizedTest
    @CsvSource({
            //happy path:
            "AeIoU, 5",
            //corner cases:
            "hello, 2",
            "java, 2",
            "bcdfg, 0",
            "'', 0"
    })
    public void userCanCountVowels(String input, int expectedResult){
        assertEquals(expectedResult, t2.countVowels(input), "Number of vowels doesn't match expected result");
    }

    @Test
    public void userCannotCountVowelsFromNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            t2.countVowels(null);
        },
                "Error should throw IllegalArgumentException");
    }
}
