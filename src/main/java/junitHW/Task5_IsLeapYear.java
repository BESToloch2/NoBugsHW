package junitHW;

public class Task5_IsLeapYear {
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    //Watch what is KRATNOST. ok i understand the first condition,
    // but why we chak 400 too if we already have a %100
}
