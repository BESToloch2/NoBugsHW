package juntHW;

import junitHW.Task5_IsLeapYear;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5_IsLeapYearTest {
    /*Обычные годы: 2025, 2023
Високосные (2020, 2000, 1600)
Года, которые делятся на 100, но не на 400 (1900, 2100)*/
   private Task5_IsLeapYear t5;

    @BeforeEach
    public void setup(){
        t5 = new Task5_IsLeapYear();
    }

    @ParameterizedTest
    @ValueSource(ints = {2025, 2023})
    public void userCanCheckNonLeapYear(int year){
        assertFalse(t5.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    public void userCanCheckLeapYear(int year){
        assertTrue(t5.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    public void userCanCheckCenturyYearNotDivisibleBy400(int year){
        assertFalse(t5.isLeapYear(year));
    }
}
