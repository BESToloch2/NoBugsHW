package juntHW;

import junitHW.Task4_FindMaxNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task4_FindMaxNumberTest {

    private Task4_FindMaxNumber t4;

    private static Stream<Arguments> provideArrays(){
        return Stream.of(
                //happy path:
                Arguments.of(new int[]{3, 4, 7 ,2}, 7),
                //corner cases:
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{-1}, -1)
        );
    }

    @BeforeEach
    public void setup(){
        t4 = new Task4_FindMaxNumber();
    }
    /*
    * happy path: ([3, 4, 7, 2]) -> 7
    * corner cases:
    * [0] -> 0
    * [-1] -> -1
    * negative: [] -> NoSuchElementException*/

    @ParameterizedTest
    @MethodSource("provideArrays")
    public void userCanFindMaxNumber(int[] numbers, int expectedResul){
        assertEquals(expectedResul, t4.findMax(numbers));
    }

    @Test
    public void userCannotFindMaxNumberInEmptyArray(){
        assertThrows(NoSuchElementException.class,() -> t4.findMax(new int[]{}));
    }
}
