package junitHW;

import java.util.Arrays;

public class Task4_FindMaxNumber {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
