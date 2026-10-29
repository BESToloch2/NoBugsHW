package juntHW;

import junitHW.Task12_SortListOfStringByLength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task12_SortListOfStringByLengthTest {
    /*[ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
Одинаковые длины ([ "aa", "bb", "cc" ])
Пустой список*/
    private Task12_SortListOfStringByLength t12;
    @BeforeEach
    public void setup(){
        t12 = new Task12_SortListOfStringByLength();
    }

    public static Stream<Arguments> provideLists(){
      return Stream.of(
              Arguments.of(List.of("Java", "C", "Python"),
                      List.of("C", "Java", "Python")),

              Arguments.of(List.of("aa", "bb", "cc"),
                      List.of("aa", "bb", "cc")),

              Arguments.of(List.of(""),
                      List.of(""))
      );
    }
    @ParameterizedTest
    @MethodSource("provideLists")
    public void userCanProvideValidList(List<String> input, List<String> expectedResult){
        assertEquals(expectedResult, t12.sortByLength(input));
    }
}
