package conditionalOperatorAndLoops;

import java.util.Scanner;

public class HWBreakAndContinueKWords {
    static Scanner scanner = new Scanner(System.in);

    //1. Сумма чисел до первого отрицательного (использовать break)
    public static void sumOfPositiveNums(){
        int input;
        int sum = 0;

        while(true){
            System.out.println("Enter num: ");
            input = scanner.nextInt();
            if (input < 0){
                System.out.println("Total sum is: " + sum);
                System.out.println("Program completed");
                break;

            }else {
                sum += input;
            }
        }
    }

    //2. Пропуск чисел, делящихся на 3 (использовать continue)

    public static void skipIfDivisibleBy3(){
        for (int i = 1; i < 21; i++) {
            if (i % 3 != 0){
                System.out.println(i);
            }
        }
    }

    //3. Вывод только положительных чисел (использовать continue)
    public static void printOnlyPositiveNums(){
        int input = 0;

        while (true){
            System.out.println("Enter the number: ");
            input = scanner.nextInt();

            if (input == 0) {
                System.out.println("Program stopped");
                break;
            }

            if (input >= 0){
                System.out.println(input);
            }else {
                System.out.println("Number was skipped");
                continue;
            }
        }
    }

    //4. Ввод строк до команды "stop" (использовать break)
    public static void computerCommands(){
        String input = "";

        while (true){
            System.out.println("Enter the command: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")){
                System.out.println("Program stopped");
                break;
            }else {
                System.out.println("Processing Command");
                System.out.println("**************************************************************");
            }
        }
    }







    public static void main(String[] args) {

        //sumOfPositiveNums();
        //skipIfDivisibleBy3();
        //printOnlyPositiveNums();
        //computerCommands();








    }
}
