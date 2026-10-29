package juntHW;

import junitHW.Task9_CountNumberOfWordsInAString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class Task9_CountNumberOfWordsInAStringTest {
    /*Тесты должны проверять:
    Пустую строку
    null
    Строку с несколькими пробелами

    positive: "Hello my name is Sasha" -> 5
    corner case:
    "   Hello world  " -> 2
    "" -> 0
    negative: null - > IllegalArgumentException
*/
    private Task9_CountNumberOfWordsInAString t9;
    //why not private
    @BeforeEach
    public void setup(){
        t9 = new Task9_CountNumberOfWordsInAString();
    }

    @ParameterizedTest
    @CsvSource({
            //happy path
            "'Hello my name is Sasha', 5",
            //corner
            "'   Hello   world  ', 2",
            "'', 0",
    })
    public void userProvideValidString(String input, int expectedResult){
        assertEquals(expectedResult, t9.countWords(input));
    }

    @Test
    public void userProvideNullString(){
        assertThrows(NullPointerException.class, () -> t9.countWords(null));
    }
}