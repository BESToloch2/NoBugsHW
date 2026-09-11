package conditionalOperatorAndLoops;

import java.util.Scanner;

public class HWForLoop {
    static Scanner s = new Scanner(System.in);

    //1. Вывод чисел от 1 до 100, делящихся на 3
    public static void printNumbersFrom1_100WhichDevidedBy_3(){

        for (int i = 1; i < 101; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    //2. Сумма чисел от 1 до n
    public static void printSumOfNumsByN(){
        System.out.println("Enter the number: ");
        int n = s.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //3. Таблица умножения для числа
    public static void multiplicationTable(){
        System.out.println("Enter number: ");
        int input = s.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(input + " * " + i + " = " + input * i);
        }
    }

    //4. Проверка на простое число

    public static void isNumPrime(){
        System.out.println("Enter the num: ");
        int input = s.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < input ; i++) {
            if(input % i == 0){
                isPrime = false;
            }
        }
        System.out.println(isPrime);
    }

    public static void printMunsFrom1_10(){
        for (int i = 1; i < 11 ; i++) {
            System.out.println(i);
        }
    }



    public static void main(String[] args) {
        //printNumbersFrom1_100WhichDevidedBy_3();
        //printSumOfNumsByN();
        //multiplicationTable();
        //isNumPrime();
        //printMunsFrom1_10();











    }
}
