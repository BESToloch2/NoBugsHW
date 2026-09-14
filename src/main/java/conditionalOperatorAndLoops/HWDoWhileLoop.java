package conditionalOperatorAndLoops;

import java.util.Scanner;

public class HWDoWhileLoop {
    static Scanner s = new Scanner(System.in);

    //1. Запрос положительного числа
    public static void enternumsUntilTheyPositive(){
        int input = 0;
        do {
            System.out.println("Enter the num: ");
             input = s.nextInt();
        }while(input <=0 );
    }

    //2. Проверка пароля
    public static void passwordCheck(){

        String password = "";
        do {
            System.out.println("Enter password: ");
            password = s.nextLine();

            if (!password.equals("12345")){
                System.out.println("Invalid password!");
            }else {
                System.out.println("Access approved!");
            }

        }while (!password.equals("12345"));
    }

    //3. Вывод чисел от 1 до 10 с использованием do-while
    public static void printNumsFrom1To10(){
        int counter = 1;
        do {
            System.out.println(counter);
            counter++;
        }while (counter <= 10);
    }

    //4. Завершение программы по команде "exit"
    public static void interruptCommand(){
        String command = "";
        do {
            System.out.println("Enter command: ");
            command = s.nextLine();

            if (!command.equalsIgnoreCase("exit")){
                System.out.println("Processing");
            }else {
                System.out.println("Exit completed");
            }
        }while (!command.equalsIgnoreCase("exit"));
    }

    //5. Подсчёт количества цифр в числе
    public static void sumOfNums(){
        System.out.println("Enter number: ");
        int input = s.nextInt();
        int counter = 0;
        do {
            input /= 10;
            counter++;
        }while(input != 0);
        System.out.println(counter);
    }


    public static void main(String[] args) {
        //enternumsUntilTheyPositive();
        //passwordCheck();
        //printNumsFrom1To10();
        //interruptCommand();
        //sumOfNums();


    }
}
