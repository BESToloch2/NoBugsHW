package conditionalOperatorAndLoops;

import java.util.Scanner;

public class TasksWithConditionalOperatorSwitch {
   // Main scanner for all methods
    Scanner s =new Scanner(System.in);

    //1. Вывод дня недели по номеру
    public void prinDayOfWeekByNumber(){

        System.out.println("Enter number of day: ");
        int input = s.nextInt();

        switch(input){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input");
        }
    }

//2. Стоимость билета по дню недели
    public void TicketPriceEstimationByDayOfAWeek(){
        System.out.println("Enter day of a week by numbers 1 - 7: ");
        int input = s.nextInt();
        if (input > 5){
            System.out.println(" The price is 450 rub");
        }else {
            System.out.println("The price is 300 rub");
        }
    }

    //3. Перевод числовых оценок в буквенные (A–F)
    public void ConvertNumericalGradesToLetterGrades(){
        System.out.println("Enter numerical grade: ");
        int input = s.nextInt();

       if(input > 89){
           System.out.println("A");
       }else if (input > 79){
           System.out.println("B");
       }else if (input > 69){
           System.out.println("C");
       }else if (input > 59){
           System.out.println("D");
       }else {
           System.out.println("F");
       }
    }

    //4. Обработка текстовых команд
    public void textCommandProcessing(){
        System.out.println("Enter command");
        String input = s.nextLine();

        switch (input){
            case "start" -> System.out.println("System started");
            case "stop" -> System.out.println("System stoped");
            case "restart" -> System.out.println("System restarted");
            case "status" -> System.out.println("Print pc info");
            default -> System.out.println("Invalid command");
        }
    }

    //5. Простой калькулятор с использованием switch
    public void calculatorWithSwitch(){
        System.out.println("Enter first number: ");
        double n1 = s.nextDouble();

        System.out.println("Enter second number: ");
        double n2 = s.nextDouble();

        System.out.println("Enter calculation operator (+, -, *, /): ");
        String o = s.next();

        switch (o){
            case "+" -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            case "-" -> System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            case "*" -> System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            case "/" -> {
                if (n2 == 0) {
                    System.out.println("division by 0 restricted");
                }else {
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                }
            }
            default -> System.out.println("Incorrect operator");
        }
    }

    public static void main(String[] args) {

        TasksWithConditionalOperatorSwitch tWcOs = new TasksWithConditionalOperatorSwitch();

       // tWcOs.prinDayOfWeekByNumber();
        //tWcOs.TicketPriceEstimationByDayOfAWeek();
        //tWcOs.ConvertNumericalGradesToLetterGrades();
        //tWcOs.textCommandProcessing();
        //tWcOs.calculatorWithSwitch();













    }
}
