package practice4;

import java.util.Random;
import java.util.Scanner;

public class TaskSolve {

    // if else operators

    public String checkParity( int num){
        String result = (num % 2 == 0) ? "Четное" : "Нечетное";
        return result;
    }

    public String dasdd(int num){
        String res = (num > 10) ? "sadsad" : "sadaffafg";
        return res;
    }

    public int maxNum(int a, int b, int c){
        int bigestNum = a;
        if (a < b){
            bigestNum = b;
        }else if (bigestNum < c) {
            bigestNum = c;
        }
        return bigestNum;
    }

    //switch operator

    public String dayOfWeek(int day){
        String dayOfWeek = "";
        switch (day){
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                System.out.println("Wrong input");
        }
        return dayOfWeek;
    }

    public String describeSeasone(Season s){
        String description = "";
        switch (s){
            case WINTER -> description = "holodno";
            case AUTUMN -> description = "listya";
            case SPRING -> description = "dozhd";
            case SUMMER -> description = "solnce";
        }
        return description;
    }

    //for operator

    public void numMultiplication(int num){
        for (int i = 1; i<=10; i++){
            System.out.println( num + " * " + i + " = " + num * i);
        }
    }

    public int sumOfAllNums(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public  boolean  checkIsNumPrime(int n){
        boolean res = true;
            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    res = false;
                    break;
                }
            }
        return res;
    }

    public  void printAllPrimeNumsUntil100(){
        for (int i = 2; i <= 100; i++) {
            if (checkIsNumPrime(i)){
                System.out.println(i);
            }
        }
    }

    public void enterUntilExit(){
        Scanner s =new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")) {
            System.out.println("Enter: ");
            input = s.nextLine();
        }
        System.out.println("Programme done");
    }

    public int sumOfDigits(int num){
        int sum = 0;

        while(num >= 1){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public void findNumber(int bound){
        int rN = new Random().nextInt(bound);
        Scanner s =new Scanner(System.in);

        int input;

        do {
            System.out.println("Guess number: ");
            input = s.nextInt();
            if (rN > input){
                System.out.println("bigger");
            } else if (rN < input) {
                System.out.println("smaller");
            }
        } while (input != rN);
        System.out.println("Right!");
    }

    public void inputAndFindMin(){
        Scanner s = new Scanner(System.in);
        int input;

        int minPositiveNumber = Integer.MAX_VALUE;

        do {
            System.out.println("Enter number: ");
            input = s.nextInt();

            if (input < minPositiveNumber && input >-1){
                minPositiveNumber = input;
            }

        } while (input > -1);
        System.out.println(" Min positive entered num is : " + minPositiveNumber);
    }

    public void checkCredentials(){
        Scanner s = new Scanner(System.in);
        String login;
        String password;

        do{
            System.out.println("Enter login:");
            login = s.nextLine();
            System.out.println("Enter password:");
            password = s.nextLine();
        } while (!login.equals("admin") && !password.equals("123"));
        System.out.println("Excess approved");
    }




    public static void main(String[] args) {
        TaskSolve ts = new TaskSolve();
    /*    System.out.println(ts.maxNum(7,3,10));
        System.out.println(ts.maxNum(7,2,3));
        System.out.println(ts.maxNum(1,33,10));

        System.out.println(ts.dayOfWeek(6));
        System.out.println(ts.dayOfWeek(10));

        System.out.println(ts.describeSeasone(Season.WINTER));

        ts.numMultiplication(3);

        System.out.println(ts.sumOfAllNums(10));
        System.out.println(ts.sumOfAllNums(5));

        System.out.println(ts.checkIsNumPrime(4));

        //ts.printAllPrimeNumsUntil100();

        //ts.enterUntilExit();*/

        //System.out.println( ts.sumOfDigits(123));

       // ts.findNumber(5);

        //ts.inputAndFindMin();

        ts.checkCredentials();








    }



}
