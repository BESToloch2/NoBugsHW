package conditionalOperatorAndLoops;

import java.util.Scanner;

public class TasksWithConditionalOper {
    Scanner s = new Scanner(System.in);

    //1. Определение знака числа
    public  void checkSimbolOfNum(){


        System.out.println("Enter number: ");

        int n = s.nextInt();

        if (n > 0){
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        }else {
            System.out.println("Number equals 0");
        }
    }

    //2. Поиск наибольшего из двух чисел
    public  void findBiggestNum(){
        System.out.println("Enter first number: ");
        int n1 = s.nextInt();
        System.out.println("Enter second number: ");
        int n2 = s.nextInt();

        if (n1 > n2){
            System.out.println("Biggest number is: " + n1);
        }else {
            System.out.println("Biggest number is: " + n2);
        }
    }

    //3. Вывод оценки по шкале 1–5
    public void ratingOutputOnA_1To_5Scale(){
        System.out.println(" Enter grade: ");
        int n = s.nextInt();

        switch (n){
            case 1,2 -> System.out.println("Неудовлетворительно");
            case 3 -> System.out.println("Удовлетворительно");
            case 4 -> System.out.println("Хорошо");
            case 5 -> System.out.println("Отлично");
            default -> System.out.println("Invalid input. Use grades from 1 to 5.");
        }
    }

    //4. Проверка на чётность
    public void oddOrEven(){
        System.out.println("Enter number: ");
        int n = s.nextInt();

        if (n % 2 == 0){
            System.out.println("The number is odd");
        }else {
            System.out.println("The number is even");
        }
    }

    //5. Определение размера скидки по возрасту
    public void determinDiscount() {
        System.out.println("Enter your age: ");
        int discount;
        int n = s.nextInt();
        if (n < 18){
            discount = 25;
        } else if (n > 65) {
            discount = 30;
        }else {
            System.out.println("No discount");
        }
    }

    //6. Оценка результата теста по баллам
    public void estimationOfTestResult(){
        System.out.println("Enter your test result: ");

        int n = s.nextInt();

        if (n > 90){
            System.out.println("Отлично");
        }else if (n > 75 ){
            System.out.println("Хорошо");
        } else if (n > 60) {
            System.out.println("Удовлетворительно");
        }else {
            System.out.println("Неудовлетворительно");
        }
    }












    public static void main(String[] args) {

        TasksWithConditionalOper tWcO = new TasksWithConditionalOper();


        //tWcO.checkSimbolOfNum();

        //tWcO.findBiggestNum();

        //tWcO.ratingOutputOnA_1To_5Scale();

        tWcO.estimationOfTestResult();












    }
}
