package exceptionsAndGenerics.exceptions;

public class Task2 {
    //2. Обработка непроверяемого исключения
    //Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление. Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.

    public static int divide(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Can`t divide by 0");
        }

        return a/b;
    }

    public static void main(String[] args) {

        try {
            System.out.println(divide(5, 0));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }



}
