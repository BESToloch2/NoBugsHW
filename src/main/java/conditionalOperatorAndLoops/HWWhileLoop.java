package conditionalOperatorAndLoops;

import java.util.Scanner;

public class HWWhileLoop {

    static Scanner s = new Scanner(System.in);

    //1. Вычисление факториала с помощью while
    public static void factorialCalc(){
        System.out.println("Enter the number: ");
        int input = s.nextInt();
        int counter = 1;
        int result = 1;

        while (counter <= input){
            result *= counter;
            counter++;
        }
        System.out.println(result);
    }

    //2. Вывод всех чётных чисел до заданного

    public static void printAllEvenNumsUntilN(){
        System.out.println("Enter the number: ");
        int input= s.nextInt();
        int counter = 1;

        while (counter <= input){
            if (counter % 2 == 0){
                System.out.println(counter);
            }
            counter++;
        }
    }

    //3. Обратный отсчёт от введённого числа до 1
    public static void reversedCalculation(){
        System.out.println("Enter the number: ");
        int input = s.nextInt();

        while (input >= 1){
            System.out.println(input);
            input --;
        }
    }



    public static void main(String[] args) {
       // factorialCalc();
       // printAllEvenNumsUntilN();
       // reversedCalculation();




    }
}
