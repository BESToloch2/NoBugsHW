package junitHW;

import java.util.Arrays;

public class Task8_FindSecondLargestNumber {
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

}
