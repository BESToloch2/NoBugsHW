package juntHW;

import junitHW.Task8_FindSecondLargestNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task8_FindSecondLargestNumberTest {
        /*Обычные массивы
Массив с одинаковыми числами
Один элемент в массиве (должно выбрасываться исключение)
*/
    //Test cases are based on the expected behavior of findSecondMax().
    /*happy path: [1,2,3,4,5] -> 4 .checks the basic functionality.
    *corner cases:
    *   [1,2,3,3,4] -> 3 .checks duplicate values in the middle.
    *   [1,2,3,4,5,6,6] -> 5 .checks duplicate maximum values.
    * negative:
    *   [1] -> NoSuchElementException (by method it should be IllegalArgument, but by logic -> NoSuchElement)
    *   [3,3,3] -> NoSuchElementException*/

    private Task8_FindSecondLargestNumber t8;
    @BeforeEach
    public void setup(){
        t8 = new Task8_FindSecondLargestNumber();
    }

    /*Three tests fail because of the current method implementation.
    The method uses numbers.length - 2 after distinct(), but numbers.length
    represents the original array size, including duplicates.
    This causes incorrect results when duplicate values are present.*/
    private static Stream<Arguments> provideValidArrays(){
        return Stream.of(
            Arguments.of(new int[] {1,2,3,4,5}, 4),
            Arguments.of(new int[] {1, 2, 3, 3, 4}, 3),
                Arguments.of(new int[] {1,2,3,4,5,6,6}, 5)
        );
    }
    @ParameterizedTest
    @MethodSource("provideValidArrays")
    public void userCanFindSecondLargestNumberInValidArray(int[] input, int expectedResult){
        assertEquals(expectedResult, t8.findSecondMax(input));
    }

    /*
     For a single-element array, skip(-1) throws IllegalArgumentException.
     However, I expected NoSuchElementException because the second largest
     number does not exist.
    */
    private static Stream<Arguments> provideInvalidArrays(){
        return Stream.of(
                Arguments.of(new int[] {1}),
                Arguments.of(new int[] {3, 3, 3})
        );
    }
    @ParameterizedTest
    @MethodSource("provideInvalidArrays")
    public void userCanFindSecondLargestNumberInInvalidArray(int[] input){
        assertThrows(NoSuchElementException.class, () -> t8.findSecondMax(input));
    }

    /*
     I kept the expected results based on the intended behavior rather than
     changing them to match the current implementation.
     */
}
