package juntHW;

import junitHW.Task1_IsEven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1_IsEvenTest {

    private Task1_IsEven task1;

    @BeforeEach
    public void setup(){
        task1 = new Task1_IsEven();
    }

    /*
    * happy path: 4 -> true
    * negative: 3 -> false
    * corner cases:
    * 0 -> true
    * -4 -> true
    * -3 -> false
     */

    @ParameterizedTest
    @ValueSource(ints=
            //happy path: 4 -> true
            {4,
            //corner cases:
             0, -4
    })
    public void userProvideEvenNumber(int number){
        assertTrue(task1.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints={
            // negative
            3,
            //corner cases:
            -3
    })
    public void userProvideOddNumber(int number){
        assertFalse(task1.isEven(number));
    }
}
