package juntHW;

import junitHW.Task7_FactorialOfNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task7_FactorialOfNumberTest {
    /*positive: 5! -> 120
    corner:
    0! -> 1
    1! -> 1
    7! -> 5040
    negative: -4 -> IllegalArgumentException
*/
    private Task7_FactorialOfNumber t7;

    @BeforeEach
    public void setup(){
        t7 = new Task7_FactorialOfNumber();
    }

    @ParameterizedTest
    @CsvSource({
            "5, 120",
            "0, 1",
            "1, 1",
            "7, 5040"
    })
    public void userCanCalculateFactorialWithNonNegativeNumber(int input, int expectedResult){
        assertEquals(expectedResult, t7.factorial(input));
    }

    @Test
    public void userCannotCalculateFactorialWithNegativeNumber(){
        assertThrows(IllegalArgumentException.class, () -> t7.factorial(-4));
    }
}
